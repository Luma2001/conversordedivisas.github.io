package conversoresVarios.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelConversorTemperaturas extends JFrame{
	
	
	//Atributos
	protected JMenuBar menuBar;
	protected JMenu menu;
	protected JMenuItem opcion1;
	protected JMenuItem opcion2;
	protected JMenuItem opcion3;
	protected JMenuItem opcion4;
	JPanel panel;
	
	public PanelConversorTemperaturas() {
		
	}

	public static void mostrarPanel(JPanel panel) {
		
		//debo iniciar los atributos de la clase
				menuBar = new JMenuBar();
				menu = new JMenu("Seleccione una opción");//es el mensaje antes de las opciones
				opcion1 = new JMenuItem("Conversión de Celcius a Fahrenheit");
				opcion2 = new JMenuItem("Conversión de Fahrenheit a Celsius");
				opcion3 = new JMenuItem("Volver al menú principal");
				opcion4 = new JMenuItem("Salir");
				
				menu.add(opcion1);
				menu.add(opcion2);
				menu.add(opcion3);
				menu.add(opcion4);
				
				menuBar.add(menu);
				panel.add(menuBar);
				
				opcion4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(menu,"Qué pena!!! Vuelva pronto");
						System.exit(0) ;
						
					}
				});
		

	}

	
}