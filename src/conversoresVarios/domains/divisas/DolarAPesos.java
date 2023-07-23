package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class DolarAPesos extends Resultado implements Convertir {

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
