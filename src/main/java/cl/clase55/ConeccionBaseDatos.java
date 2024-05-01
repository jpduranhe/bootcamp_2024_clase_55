package cl.clase55;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConeccionBaseDatos {
	
	private Connection conn;
	
	public boolean initConeccion() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String stringConection="jdbc:mysql://localhost:3306/mascotainadorñ";
			String user="tester";
			String pass="Prueba1234";
			conn= DriverManager.getConnection(stringConection,user,pass);
			
			return true;
		}catch(ClassNotFoundException ex) {
			System.out.println("Error:Driver no encontrado");
			return false;
		}catch(SQLException ex) {
			System.out.println("Fallo:");
			System.out.println("SQLException:"+ ex.getMessage());
			System.out.println("SQLState:"+ ex.getSQLState());
			System.out.println("VendorError:"+ ex.getErrorCode());
			return false;
		}
		
	}

}
