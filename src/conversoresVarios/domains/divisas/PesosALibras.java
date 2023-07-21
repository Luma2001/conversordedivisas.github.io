package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class PesosALibras extends Divisa implements ConvertirDivisa{

	public PesosALibras() {
		super();
		
	}
	
	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.00299997;
		return this.resultado;
	}

}
