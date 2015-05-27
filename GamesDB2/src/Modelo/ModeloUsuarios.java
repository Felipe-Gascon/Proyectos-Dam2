package Modelo;

import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.ResultSetMetaData;

//Seleccionamos los datos de la BBDD que queremos aplicar
public class ModeloUsuarios {
	private final static String USUARIOS_SEL="SELECT * FROM usuarios";
	private final static String USUARIO_COL="usuario";
	
	
	private Connection conexion = null;
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;
	
	private ArrayList<String> usuarios = null;
	
	public ModeloUsuarios() {
		conexion=ConexionDB.getConexion();
		usuarios = new ArrayList<String>();
		
	}
		//Utilizamos un arraylist, para guardar los usuarios
	public ArrayList getusuarios(){
		try{
			instruccion=this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
			
			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				usuarios.add (conjuntoResultados.getString(USUARIO_COL));
			}// fin de while
			return usuarios;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return usuarios;
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}
}