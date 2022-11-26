package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class BaseDeDatos {
	private static Connection con;
	private static Statement s;
	private static ResultSet rs;
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static boolean creacionBD( String nombreBD ) {
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:" + nombreBD);
			// Tabla Clientes
			s = con.createStatement();
			String sent = "create table IF NOT EXISTS cliente (dni STRING PRIMARY KEY, nombre varchar(100), apellidos varchar(100), fecha_Nac varchar(100))";
			s.executeUpdate( sent );
			// Tabla Pedidos
			String sent2 = "create table IF NOT EXISTS pedido (id INTEGER PRIMARY KEY, titular varchar(10), precio integer, tipoProducto varchar(100), extra boolean, FOREIGN KEY (titular) REFERENCES cliente(dni))"; 
			s.executeUpdate( sent2 );
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void cerrarConexion() {
		try {
			con.close();
			s.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
