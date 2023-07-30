package conversoresVarios.gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.pesos.CalcularPeso;
import conversoresVarios.aplications.pesos.EnumPeso;



public class PanelConversorPeso {


	public static void mostrarPanel(JPanel panel) {
		
		Double valor = null;
		boolean continuar=true;
		
		
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
					"Valor no v�lido. Ingrese un n�mero",//mensaje devuelto
					"ERROR ",//titulo
					JOptionPane.PLAIN_MESSAGE);
			continuar=false;
	       	
		}
		
		} while(!continuar);
								
		String peso = (JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
			"Elije una opci�n:", //mensaje
			"Calcular conversi�n de Pesos",//titulo
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
		"Conversi�n: "+ resultado +" de "+ tipo, //mensaje mostrando resultado
		"RESULTADO", //titulo
		JOptionPane.PLAIN_MESSAGE);	
		
		
	}	
				
				

	
}//fin class
