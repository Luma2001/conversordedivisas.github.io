package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class EuroAPesos extends Divisa implements ConvertirDivisa {

	
	public EuroAPesos() {
		super();
		
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	
	@Override
	public double calcular(double monto) {
		this.resultado =monto*284.831;
		return this.resultado;
	}

}
