package conversoresVarios.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Conversor extends JFrame{

	//Atributos 
	
	JPanel panel = new JPanel();
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcion1;
	private JMenuItem opcion2;
	private JMenuItem opcion3;
	private JMenuItem opcion4;
	private JMenuItem opcion5;
	
	
	//Constructor donde creo el marco o cuadro	
	public Conversor(){
		//Al extender de JFrame, no necesito crear: JFrame frame = new JFrame("Conversor de Divisa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); 
        setTitle("Calculadora de Conversiones");
        getContentPane().add(BorderLayout.CENTER, panel);
        setVisible(true);
         
        mostrarMenu(); 
        
        
        panel.add(menuBar);
        add(panel);
     
      
         
	}    
        
        
        public void mostrarMenu() {
    		//debo hacer inicializacion de los atributos de la clase
    		menuBar = new JMenuBar();
    		menu = new JMenu("Elija una opción");//es el mensaje antes de las opciones
    		opcion1 = new JMenuItem("1- Conversor de Divisas");
    		opcion2 = new JMenuItem("2- Conversor de Temperatura");
    		opcion3 = new JMenuItem("3- Conversor de Peso");
    		opcion4 = new JMenuItem("4- Conversor de Longitud");
    		opcion5 = new JMenuItem("5- Salir");
    		
    		menu.add(opcion1);
    		menu.add(opcion2);
    		menu.add(opcion3);
    		menu.add(opcion4);
    		menu.add(opcion5);
    		
    		menuBar.add(menu);
    		
    	 opcion1.addActionListener(new ActionListener() {

   			@Override
   			public void actionPerformed(ActionEvent e) {
   				PanelConversorDivisas.mostrarPanel(panel);
   				
   			}
   			
   		});         
        
    	 opcion2.addActionListener(new ActionListener() {
    		 
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				
    				PanelConversorTemperaturas.mostrarPanel(panel);
    				
    			}
    			
    		});

    	 opcion3.addActionListener(new ActionListener() {
    		 
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				
 				PanelConversorPeso.mostrarPanel(panel);
 				
 			}
 			
 		});
    	 
    	 
    	 opcion4.addActionListener(new ActionListener() {
    		 
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				
  				PanelConversorLongitud.mostrarPanel(panel);
  				
  			}
  			
  		});
    	 
    	 
    	 
    	 
    	 opcion5.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				JOptionPane.showMessageDialog(menu,"Qué pena!!! Vuelva pronto");
 				System.exit(0) ;
 				
 			}
 		});
       
    	 
    	
    	 
      }  
        
        	
}