package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PesosADolar extends Resultado implements Convertir {

	public PesosADolar() {
		super();
		
	}

	
	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.00384200;
		return this.resultado;
	}

}
