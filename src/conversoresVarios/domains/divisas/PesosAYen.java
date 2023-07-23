package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PesosAYen extends Resultado implements Convertir{

	public PesosAYen() {
		super();
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.548117 ;
		return this.resultado;
	}

}
