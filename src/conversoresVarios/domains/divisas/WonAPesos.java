package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class WonAPesos extends Divisa implements ConvertirDivisa{

	public WonAPesos() {
		super();
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.199982;
		return this.resultado;
	}

}
