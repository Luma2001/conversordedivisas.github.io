package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class EuroAPesos extends Resultado implements Convertir {

	
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
