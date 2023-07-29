package conversoresVarios.domains.pesos;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class KilosALibras extends Resultado implements Convertir {

	
	public KilosALibras() {
		super();
		
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*2.2046226218;
		return this.resultado;
	}

	

}
