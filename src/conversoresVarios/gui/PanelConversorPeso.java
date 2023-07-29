package conversoresVarios.gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.pesos.CalcularPeso;
import conversoresVarios.aplications.pesos.EnumPeso;



public class PanelConversorPeso {


	public static void mostrarPanel(JPanel panel) {
		
		
				
		double valor = Double.parseDouble(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
										"Peso:", //mensage
										"Ingrese valor", //titulo
										JOptionPane.PLAIN_MESSAGE));
								
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
		
		
	}	
				
				

	
}//fin class
