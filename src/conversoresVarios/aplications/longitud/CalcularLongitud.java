package conversoresVarios.aplications.longitud;

import conversoresVarios.domains.longitud.CmAPulgada;
import conversoresVarios.domains.longitud.KmAMilla;
import conversoresVarios.domains.longitud.MetroAPulgada;
import conversoresVarios.domains.longitud.MetroAYarda;
import conversoresVarios.domains.longitud.PulgadaACm;
import conversoresVarios.domains.longitud.PulgadaAMetro;
import conversoresVarios.domains.longitud.YardaAMetro;

public class CalcularLongitud {

	public static double resultado (EnumLongitudes longitud, double monto) {
		double montoConvertido=0;
		
		
		if(longitud.equals(EnumLongitudes.CM_A_PULGADA)) {
			CmAPulgada valor = new CmAPulgada();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.PULGADA_A_CM)) {
			PulgadaACm valor = new PulgadaACm();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.METRO_A_PULGADA)) {
			MetroAPulgada valor = new MetroAPulgada();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.PULGADA_A_METRO)) {
			PulgadaAMetro valor = new PulgadaAMetro();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.METRO_A_YARDA)) {
			MetroAYarda valor = new MetroAYarda();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.YARDA_A_METRO)) {
			YardaAMetro valor = new YardaAMetro();
			montoConvertido = valor.calcular(monto);
		}
		
		if(longitud.equals(EnumLongitudes.KM_A_MILLA)) {
			KmAMilla valor = new KmAMilla();
			montoConvertido = valor.calcular(monto);
		}
		
		
		return montoConvertido;
	}
		
		

}
