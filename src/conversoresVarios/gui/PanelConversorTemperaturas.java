package conversoresVarios.gui;


import javax.swing.JOptionPane;
import javax.swing.JPanel;


import conversoresVarios.aplications.temperaturas.CalcularTemperatura;
import conversoresVarios.aplications.temperaturas.EnumTemperatura;


public  class PanelConversorTemperaturas {
	
	
	
	
	

	public static void mostrarPanel(JPanel panel) {
		
		
				
		int valor = Integer.parseInt(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
										"Grados:", //mensage
										"Ingrese Temperatura", //titulo
										JOptionPane.PLAIN_MESSAGE));
								
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
		"Conversión: "+ resultado +" "+ tipo, //mensaje mostrando resultado
		"RESULTADO", //titulo
		JOptionPane.PLAIN_MESSAGE);	
		
		
	}	
				
				

	
}//fin class