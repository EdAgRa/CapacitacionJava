package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion() {
        Connection conexion = null;//objeto de tio conexión
        var baseDatos = "zona_fit_db";//Nombre de la base de datos
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;// ruta de conexión
        var usuario = "root";// usuario
        var password = "admin";//clave de usuario
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//se carga el nombre de la clase
            conexion = DriverManager.getConnection(url, usuario, password);//se ejecuta la conexión
        }catch (Exception e) {//error en al conexión
            System.out.println("Error: Conexión DB "+e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {//prueba de conexión
        var conexion = Conexion.getConexion();//llama la clase conexión
        if (conexion != null) //pregunta si la conexión es exitosa o NO
            System.out.println("Conexion OK " + conexion);
        else
            System.out.println("Conexion FALLO "+conexion);
    }
}
