package conversoresVarios.gui;


import javax.swing.JOptionPane;
import javax.swing.JPanel;


import conversoresVarios.aplications.temperaturas.CalcularTemperatura;
import conversoresVarios.aplications.temperaturas.EnumTemperatura;


public  class PanelConversorTemperaturas {
	
	
	
	
	

	public static void mostrarPanel(JPanel panel) {
		
		
		Double valor = null;
		boolean continuar=true;
		
		
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
		
		
	}	
				
				

	
}//fin class