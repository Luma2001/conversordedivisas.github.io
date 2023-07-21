package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class PesosAEuro extends Divisa implements ConvertirDivisa {

	
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
