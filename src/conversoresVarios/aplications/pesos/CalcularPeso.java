package conversoresVarios.aplications.pesos;

import conversoresVarios.domains.pesos.GramosAKilos;
import conversoresVarios.domains.pesos.KilosAGramos;
import conversoresVarios.domains.pesos.KilosALibras;
import conversoresVarios.domains.pesos.LibrasAKilos;

public class CalcularPeso {

	public static double resultado (EnumPeso peso, double monto) {
		double montoConvertido=0;
		
		
		if(peso.equals(EnumPeso.GRAMOS_A_KILOS)) {
			GramosAKilos valor = new GramosAKilos();
			montoConvertido = valor.calcular(monto);
		
		}
		
		if(peso.equals(EnumPeso.KILOS_A_GRAMOS)) {
			KilosAGramos valor = new KilosAGramos();
			montoConvertido = valor.calcular(monto);
		
		}
		
		if(peso.equals(EnumPeso.KILOS_A_LIBRAS)) {
			KilosALibras valor = new KilosALibras();
			montoConvertido = valor.calcular(monto);
		
		}
		
		if(peso.equals(EnumPeso.LIBRAS_A_KILOS)) {
			LibrasAKilos valor = new LibrasAKilos();
			montoConvertido = valor.calcular(monto);
		
		}
		
		
		return montoConvertido;

}
}
