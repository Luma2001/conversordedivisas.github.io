package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class WonAPesos extends Resultado implements Convertir{

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
