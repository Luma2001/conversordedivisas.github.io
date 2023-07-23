package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PesosAEuro extends Resultado implements Convertir {

	
	public PesosAEuro() {
		super();
		
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.00351290;
		return this.resultado;
	}

}
