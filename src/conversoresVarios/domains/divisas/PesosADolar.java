package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class PesosADolar extends Divisa implements ConvertirDivisa {

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
