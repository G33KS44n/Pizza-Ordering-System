package dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//step 1:import your required classes and interfaces


public class Dbcon {
	
	
	//step 2:declare your credentials as private static final String
	
	private static final String USERNAME="sohamroy";
	private static final String PASSWORD="090807";
	private static final String DRIVERNAME="oracle.jdbc.driver.OracleDriver";
	private static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	private Connection con;
	//step 3:set your jar file in your classpath
	
	//Step 4:write a public function with Connection return type
	
	public Connection getCon(){
		
		//Step 5:Load your driver by using Class.forname
		try {
			Class.forName(DRIVERNAME);
		//Step 6:Build you connection by DriverManager.getConnection()
			
			con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
public static void main(String[] args) {
	new Dbcon().getCon();
}


}
