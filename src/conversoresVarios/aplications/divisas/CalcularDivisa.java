package conversoresVarios.aplications.divisas;


import conversoresVarios.domains.divisas.*;

public class CalcularDivisa {
	
	
	public static double resultado (EnumDivisa divisa, double monto) {
		double montoConvertido=0;
		
		
		if(divisa.equals(EnumDivisa.PESOS_A_DOLAR)) {
			PesosADolar valor = new PesosADolar();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.DOLAR_A_PESOS)) {
			DolarAPesos valor = new DolarAPesos();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.PESOS_A_EURO)) {
			PesosAEuro valor = new PesosAEuro();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.EURO_A_PESOS)) {
			EuroAPesos valor = new EuroAPesos();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.PESOS_A_LIBRAS)) {
			PesosALibras valor = new PesosALibras();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.LIBRAS_A_PESOS)) {
			LibrasAPesos valor = new LibrasAPesos();
			montoConvertido = valor.calcular(monto);
		
		}
		
		if(divisa.equals(EnumDivisa.PESOS_A_YEN)) {
			PesosAYen valor = new PesosAYen();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.YEN_A_PESOS)) {
			YenAPesos valor = new YenAPesos();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.PESOS_A_WON_COREANO)) {
			PesosAWon valor = new PesosAWon();
			montoConvertido = valor.calcular(monto);
		
		}
		if(divisa.equals(EnumDivisa.WON_COREANO_A_PESOS)) {
			WonAPesos valor = new WonAPesos();
			montoConvertido = valor.calcular(monto);
		
		}
		
		
		return montoConvertido;

}
}