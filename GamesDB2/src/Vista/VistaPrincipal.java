package Vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Modelo.ModeloUsuarios;

import java.util.Iterator;

public class VistaPrincipal extends JPanel {
	
	private JPasswordField CampoContra;
	ModeloUsuarios usuarios;
	/**
	 * Create the panel.
	 */
	
	public VistaPrincipal() {
		// Creamos todos los botones y campos, que luego iran reflejados en la ventana vistaApp.
		JLabel label = new JLabel("");
		
		//Dentro de este JLabel estara la imagne del usuario
		JLabel lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Images/usuario.jpg")));
		
		//Utilizaremos el Jcombo box para definir con que usuario queremos participar
		JComboBox comboUsu = new JComboBox();
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		JLabel Txtcontra = new JLabel("Contrase\u00F1a");
		Txtcontra.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		//Creamos el campo contraseña
		CampoContra = new JPasswordField();
		
		// Se crea el boton de login(iniciar sesion)		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setEnabled(false);
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		//En caso de no tener cuenta se registraria con el boton de abajo.
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setEnabled(false);
		btnRegistrarse.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		
		
		
		//Creamos el boton de juegos
		JButton btnNewButton = new JButton("Juegos >");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		//Creamos el boton de Perfil
		JButton btnNewButton_1 = new JButton("Perfil >");
		
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(label)
					.addContainerGap(543, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblUsuario)
					.addContainerGap(490, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImagen, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
					.addGap(58))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboUsu, 0, 200, Short.MAX_VALUE)
					.addGap(333))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(CampoContra, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(Txtcontra, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(333))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnRegistrarse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
					.addGap(333))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(12)
							.addComponent(lblImagen)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblUsuario)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboUsu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(Txtcontra)
							.addGap(18)
							.addComponent(CampoContra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(btnLogin)
							.addGap(38)
							.addComponent(btnRegistrarse))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(btnNewButton)
							.addGap(47)
							.addComponent(btnNewButton_1)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//Rellenamos los datos del comboBox
		usuarios= new ModeloUsuarios();
		//Implementamos el iterator
		Iterator<String> it= usuarios.getusuarios().iterator();
		while(it.hasNext()){
			comboUsu.addItem((String)it.next()); //Mientas exista un "siguiente" el iterator nos devuelve los usuarios
		}
	}
}
