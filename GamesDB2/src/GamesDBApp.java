import Vista.VistaApp;
import Modelo.ConexionDB;
//Clase principal donde se llama a la ventana del juego para 
//que se ejecute
public class GamesDBApp {
	//Establecemos la conexion con la BBDD
		public static void main(String[] args) {
		ConexionDB gameDB;
		
		//Generamos el objeto
		gameDB= new ConexionDB("localhost", "gamedb", "root", "");
		
		if(gameDB.ConnectDB()==true) System.out.println("Conectados con Exito");
		else System.out.println("No se ha conectado");
			
			
		VistaApp vistaApp = new VistaApp();
		vistaApp.setVisible(true);
	}

}