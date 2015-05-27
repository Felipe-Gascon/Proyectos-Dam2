package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Definimos el Controlador MySQL
public class ConexionDB {
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
private String host;
private String bbdd;
private String user;
private String pass;
private String url;

	private static Connection conexion = null;
	private static ConexionDB instance = null;
//Establecemos las bases para la conexión
	public ConexionDB(String HOST, String BBDD, String USER, String PASS) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
		this.url="jdbc:mysql://"+this.host+"/"+this.bbdd; 
			
	}
	
	public static ConexionDB getInstance(String HOST,String BBDD,String USER,String PASS) {
	      if(instance == null) {
	         instance = new ConexionDB(HOST,BBDD,USER,PASS);
	      }
	      return instance;
	   }
	//Definimos la conexion 
	public boolean ConnectDB(){
		try{
			
			Class.forName(CONTROLADOR_MYSQL);
			
			conexion= DriverManager.getConnection(this.url,this.user,this.pass);
		}
		catch(SQLException excepcionSql)
		{
			excepcionSql.printStackTrace();
			return false;
		}
		catch (ClassNotFoundException claseNoEncontrada)
		{
			claseNoEncontrada.printStackTrace();
			return false;
		}
		return true;
	}
	//Hacemos que nos devuelva la conexion, para poder establecerla luego
	public static Connection getConexion() {
		
		return conexion;
	}

	

}










