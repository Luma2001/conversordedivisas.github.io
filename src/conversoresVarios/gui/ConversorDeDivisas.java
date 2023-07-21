package conversoresVarios.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ConversorDeDivisas extends JFrame{

	//Atributos 
	JButton salir = new JButton("Salir"); 
	JPanel panel = new JPanel();
	
	//Constructor donde creo el marco o cuadro	
	public ConversorDeDivisas(){
		//Al extender de JFrame, no necesito crear: JFrame frame = new JFrame("Conversor de Divisa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); 
        setTitle("Calculadora de Conversiones");
        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(true);
        
        add(panel);
        add(salir);
        PanelConversorDivisas.mostrarPanel(panel);
        PanelConversorTemperaturas.mostrarPanel(panel);
       // panel.add(menuBar);
        
      //Creamos evento para el boton salir
      		salir.addActionListener(new ActionListener() {

      			@Override
      			public void actionPerformed(ActionEvent e) {
      				System.exit(0);
      				
      			}
      			
      		});     
	}
			 
		
	
}