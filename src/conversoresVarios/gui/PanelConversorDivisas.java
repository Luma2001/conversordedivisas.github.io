package conversoresVarios.gui;



import javax.swing.JOptionPane;
import javax.swing.JPanel;

import conversoresVarios.aplications.divisas.CalcularDivisa;
import conversoresVarios.aplications.divisas.EnumDivisa;

public class PanelConversorDivisas {

	
	
	public static void mostrarPanel(JPanel panel){
		
		Double valor = null;
		boolean continuar=true;
		Object[] options = {"Sí, por favor","No, gracias", "Cancelar"};
		
		
		do {
			
		try {
		valor = Double.parseDouble(JOptionPane.showInputDialog(panel, //decimos que se situe dentro del frame creado
					"Ingresa el importe de dinero que deseas convertir", //mensage
					"Cantidad de Divisa", //titulo
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
		
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del frame creado
		"Cantidad que ingresaste es " + valor,//mensaje devuelto
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
		
		double resultado = CalcularDivisa.resultado(tipo, valor);
		
		JOptionPane.showMessageDialog(panel,//decimos que se situe dentro del panel creado
		"Conversión: "+ resultado + tipo.getValue(), //mensaje mostrando resultado
		"Monedas", //titulo
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

}
