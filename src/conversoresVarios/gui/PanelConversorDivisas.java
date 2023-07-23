package conversoresVarios.gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.divisas.CalcularDivisa;
import conversoresVarios.aplications.divisas.EnumDivisa;

public class PanelConversorDivisas {

	
	
	public static void mostrarPanel(JPanel panel) {
			
	
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
				"Ingresa el importe de dinero que deseas convertir", //mensage
				"Cantidad de Divisa", //titulo
				JOptionPane.PLAIN_MESSAGE));

		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del frame creado
		"Cantidad que ingresaste es " + cantidad,//mensaje devuelto
		"Cantidad de Divisa ",//titulo
		JOptionPane.PLAIN_MESSAGE);
		
		
		String moneda = (JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
		"Elije la divisa en la que deseas convertir", //mensaje
		"Monedas",//titulo
		JOptionPane.PLAIN_MESSAGE,
		null,
		new Object[] {"PESOS_A_DOLAR", 
					  "PESOS_A_EURO",
					  "PESOS_A_LIBRAS",
					  "PESOS_A_YEN",
					  "PESOS_A_WON_COREANO",
					  "DOLAR_A_PESOS","EURO_A_PESOS",
					  "LIBRAS_A_PESOS",
					  "YEN_A_PESOS",
					  "WON_COREANO_A_PESOS"},
		"PESOS_A_DOLAR").toString());//valor por defecto
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del frame creado
		"Conversión de: "+ moneda, //mensaje devuelto
		"Monedas", //titulo
		JOptionPane.PLAIN_MESSAGE);
		
		EnumDivisa tipo  = EnumDivisa.valueOf(moneda); //comparamos respuesta recibida con nuestra lista EnunDivisa
		
		double resultado = CalcularDivisa.resultado(tipo, cantidad);
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del panel creado
		"Conversión: "+ resultado, //mensaje mostrando resultado
		"Monedas", //titulo
		JOptionPane.PLAIN_MESSAGE);
		
			
		
	}		 

}
