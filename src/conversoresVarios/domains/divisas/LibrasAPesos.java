package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class LibrasAPesos extends Resultado implements Convertir {

	public LibrasAPesos() {
		super();
	}
	
	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*333.337;
		return this.resultado;
	}

}
