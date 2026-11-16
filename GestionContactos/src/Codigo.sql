-- 1. Crea la base de datos si no existe ya
CREATE DATABASE IF NOT EXISTS datos CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 2. Selecciona 'datos' para que las siguientes órdenes se ejecuten dentro de ella
USE datos;

-- 3. Borra el usuario 'admin' si existía con fallos y lo crea limpio con contraseña
DROP USER IF EXISTS 'admin'@'localhost';
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'Admin#34';

-- 4. Le da permiso total (leer, insertar, borrar, modificar) solo sobre la base 'datos'
GRANT ALL PRIVILEGES ON datos.* TO 'admin'@'localhost';

-- 5. Obliga a MySQL a recargar la tabla de permisos inmediatamente
FLUSH PRIVILEGES;

-- 6. Crea la estructura de la tabla 'contactos'
CREATE TABLE IF NOT EXISTS contactos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(10),
    apellidos VARCHAR(10),
    telefono VARCHAR(9)
);