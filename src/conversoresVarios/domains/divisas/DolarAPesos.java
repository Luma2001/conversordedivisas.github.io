package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class DolarAPesos extends Divisa implements ConvertirDivisa {

	public DolarAPesos() {
		super();
		
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	
	@Override
	public double calcular(double monto) {
		this.resultado =monto*260.281;
		return this.resultado;
	}


}
