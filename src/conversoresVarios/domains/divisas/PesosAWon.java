package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PesosAWon extends Resultado implements Convertir{

	public PesosAWon() {
		super();
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*4.99762;
		return this.resultado;
	}

}
