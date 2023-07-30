package conversoresVarios.gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.pesos.CalcularPeso;
import conversoresVarios.aplications.pesos.EnumPeso;



public class PanelConversorPeso {


	public static void mostrarPanel(JPanel panel) {
		
		Double valor = null;
		boolean continuar=true;
		Object[] options = {"Sí, por favor","No, gracias", "Cancelar"};
		
		
		do {
			
		try {
				
		valor = Double.parseDouble(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
										"Peso:", //mensage
										"Ingrese valor", //titulo
										JOptionPane.PLAIN_MESSAGE));
		continuar=true;
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del frame creado
					"Valor no válido. Ingrese un número",//mensaje devuelto
					"ERROR ",//titulo
					JOptionPane.PLAIN_MESSAGE);
			continuar=false;
	       	
		}
		
		} while(!continuar);
								
		String peso = (JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
			"Elije una opción:", //mensaje
			"Calcular conversión de Pesos",//titulo
			JOptionPane.PLAIN_MESSAGE,
			null,
			new Object[] {"KILOS_A_LIBRAS",
						  "LIBRAS_A_KILOS",
						  "KILOS_A_GRAMOS",
						  "GRAMOS_A_KILOS"},
						  "KILOS_A_LIBRAS").toString());//valor por defecto							
								
EnumPeso tipo  = EnumPeso.valueOf(peso); //comparamos respuesta recibida con nuestra lista EnunDivisa
		
		double resultado = CalcularPeso.resultado(tipo, valor);
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del panel creado
		"Conversión: "+ resultado +" de "+ tipo, //mensaje mostrando resultado
		"RESULTADO", //titulo
		JOptionPane.PLAIN_MESSAGE);	


		//Cuadro de dialogo desea continuar
		
		int n = JOptionPane.showOptionDialog(panel,
		"¿Desea continuar?",
		"Mensaje",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //do not use a custom Icon
		options,  //the titles of buttons
		options[0]); //default button title
		
		 if(n==1 | n==2) {
		
							JOptionPane.showMessageDialog(panel,"Programa terminado");
							System.exit(0) ;
							
						}
		
	}	
				
				

	
}//fin class
