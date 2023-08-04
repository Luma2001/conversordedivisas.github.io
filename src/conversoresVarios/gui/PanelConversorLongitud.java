package conversoresVarios.gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.longitud.CalcularLongitud;
import conversoresVarios.aplications.longitud.EnumLongitudes;

public class PanelConversorLongitud {

public static void mostrarPanel(JPanel panel) {
		
		
		Double valor = null;
		boolean continuar=true;
		Object[] options = {"Sí, por favor","No, gracias", "Cancelar"};
		
		
		do {
			
		try {		
		valor = Double.parseDouble(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
										"Longitud:", //mensage
										"Ingrese medida", //titulo
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
		
		String longitudes = (JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
			"Elija una opción:", //mensaje
			"Calcular conversión de Longitudes",//titulo
			JOptionPane.PLAIN_MESSAGE,
			null,
			new Object[] {"CM_A_PULGADA",
					"PULGADA_A_CM",
					"METRO_A_PULGADA",
					"PULGADA_A_METRO",
					"METRO_A_YARDA",
					"YARDA_A_METRO",
					"KM_A_MILLA",
					"MILLA_A_KM"},
			"PULGADA_A_CM").toString());//valor por defecto							
								
EnumLongitudes tipo  = EnumLongitudes.valueOf(longitudes); //comparamos respuesta recibida con nuestra lista EnunDivisa
		
		double resultado = CalcularLongitud.resultado(tipo, valor);
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del panel creado
		"Conversión: "+ resultado + tipo.getValue(), //mensaje mostrando resultado
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