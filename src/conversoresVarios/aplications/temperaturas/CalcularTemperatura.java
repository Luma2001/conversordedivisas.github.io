package conversoresVarios.aplications.temperaturas;

import conversoresVarios.domains.temperaturas.CaF;
import conversoresVarios.domains.temperaturas.FaC;

public class CalcularTemperatura {

	public static double resultado (EnumTemperatura temperatura, double monto) {
		double valorConvertido=0;
		
		
		if(temperatura.equals(EnumTemperatura.CELSIUS_A_FAHRENHEIT)) {
			CaF valor = new CaF();
			valorConvertido = valor.calcular(monto);
		
		}
		if(temperatura.equals(EnumTemperatura.FAHRENHEINT_A_CELSIUS)) {
			FaC valor = new FaC();
			valorConvertido = valor.calcular(monto);
		
		}
		
		return valorConvertido;
	}

}
