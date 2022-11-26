package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import BD.BaseDeDatos;

public class VentanaPrincipal {
	
	private static ResultSet rs;
	private static Connection con;
	private static Statement s;

	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.editar();
	}
	
	public VentanaPrincipal() {
		BaseDeDatos.creacionBD("manejoBD.db");
	}
	private static void conectarBD() {
		try {
			con = DriverManager.getConnection( "jdbc:sqlite:manejoBD.db" );
			s = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void editar() {
		
	}

}
