package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class LibrasAPesos extends Divisa implements ConvertirDivisa {

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
