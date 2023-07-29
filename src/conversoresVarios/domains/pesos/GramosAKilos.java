package conversoresVarios.domains.pesos;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class GramosAKilos extends Resultado implements Convertir {

	
	public GramosAKilos() {
		super();
	}

	/**
	 * M�todo de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.001;
		return this.resultado;
	}

}
