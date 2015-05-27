package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.CardLayout;

public class VistaApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
		
	
	/**
	 * Creamos la ventana.
	 */
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 560);
		//Aqui creamos el menu con sus distintos accesorios
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Principal");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Juegos");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JPanel contenedor = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(contenedor, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(contenedor, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
		);
		//Dentro de este contenedor aparecera todo lo creado en Vista Principal, y para que aparezca le damso el mismo nombre que la ventana
		contenedor.setLayout(new CardLayout(0, 0));
		contentPane.setLayout(gl_contentPane);
		contenedor.add(new VistaPrincipal(), "VistaPrincipal");
	}
}
