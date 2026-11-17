# ENUNCIADO
 
 
Andrea tiene que proseguir en la tutorización de Ana y Pedro, pero necesita recordar un par de cosas para desarrollar una base de datos porque no lo recuerda de forma exacta. Para ello tiene que utilizar una base de datos MySQL, y el conector JDBC de Java.

La forma más sencilla de trabajar con MySQL es instalar XAMPP. A partir de ese servidor de base de datos podemos desarrollar nuestra aplicación. Recuérdale a Andrea cómo se desarrolla una base de datos siguiendo los siguientes puntos:

1) Crear una base de datos llamada datos.
2) Crear un usuario admin, contraseña Admin#34
3) Crear una tabla llamada contactos, con los siguientes campos:

a.    id – Autonumérico

b.    nombre – varchar(20)

c.     apellidos – varchar(20)

d.    teléfono – varchar(30)

4) Insertar en la tabla los siguientes datos, a partir de un array:

a.    String nombres[] = {"Ana", "Carlos", "Carmen"};

b.    String apellidos[] = {"Gómez", "Lopez", "Alvarez"};

c.     String telefonos[] = {"958452154", "958654125", "958321478"};

5)    Leer el contenido de la tabla, contactos y mostrarlo por pantalla.
