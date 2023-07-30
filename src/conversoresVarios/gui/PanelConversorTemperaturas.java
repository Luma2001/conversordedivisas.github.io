package conversoresVarios.gui;




import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.temperaturas.CalcularTemperatura;
import conversoresVarios.aplications.temperaturas.EnumTemperatura;


public  class PanelConversorTemperaturas {
	
	
	public static void mostrarPanel(JPanel panel) {
		
		
		Double valor = null;
		boolean continuar=true;
		Object[] options = {"Sí, por favor","No, gracias", "Cancelar"};
		
		
		do {
			
		try {		
		valor = Double.parseDouble(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
										"Grados:", //mensage
										"Ingrese Temperatura", //titulo
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
		
		String temp = (JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
			"Elije una opción:", //mensaje
			"Calcular conversión de temperatura",//titulo
			JOptionPane.PLAIN_MESSAGE,
			null,
			new Object[] {"CELSIUS_A_FAHRENHEIT",
						  "FAHRENHEINT_A_CELSIUS"},
			"CELSIUS_A_FAHRENHEIT").toString());//valor por defecto							
								
EnumTemperatura tipo  = EnumTemperatura.valueOf(temp); //comparamos respuesta recibida con nuestra lista EnunDivisa
		
		double resultado = CalcularTemperatura.resultado(tipo, valor);
		
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