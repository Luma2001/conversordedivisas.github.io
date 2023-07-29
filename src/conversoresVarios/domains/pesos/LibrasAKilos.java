package conversoresVarios.domains.pesos;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class LibrasAKilos extends Resultado implements Convertir {

	
	public LibrasAKilos() {
		super();
		
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.45359237;
		return this.resultado;
	}

}
