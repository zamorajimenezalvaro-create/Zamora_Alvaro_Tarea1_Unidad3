import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        // 1. Datos de conexión
        String url = "jdbc:mysql://localhost:3306/datos";
        String user = "admin";
        String password = "Admin#34";

        // 2. Arrays con los datos del enunciado e inserción de los datos en la base de datos
        String[] nombres = {"Ana", "Carlos", "Carmen"};
        String[] apellidos = {"Gómez", "Lopez", "Alvarez"};
        String[] telefonos = {"958452154", "958654125", "958321478"};

        String truncateSql = "TRUNCATE TABLE contactos";
        String insertSql = "INSERT INTO contactos (nombre, apellidos, telefono) VALUES (?, ?, ?)";
        String selectSql = "SELECT id, nombre, apellidos, telefono FROM contactos";

        // 3. Conectar con la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSql);
             Statement stmt = conn.createStatement()) {

            // 4. Insertar los datos recorriendo los arrays
            for (int i = 0; i < nombres.length; i++) {
                pstmt.setString(1, nombres[i]);
                pstmt.setString(2, apellidos[i]);
                pstmt.setString(3, telefonos[i]);
                pstmt.executeUpdate();
            }

            // 5. Leer los datos y mostrarlos por pantalla
            try (ResultSet rs = stmt.executeQuery(selectSql)) {
                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("nombre") + " " +
                        rs.getString("apellidos") + " | " +
                        rs.getString("telefono")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}