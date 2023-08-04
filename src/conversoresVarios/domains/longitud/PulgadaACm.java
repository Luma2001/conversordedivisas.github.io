package conversoresVarios.domains.longitud;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PulgadaACm extends Resultado implements Convertir {

	public PulgadaACm() {
		super();
	}

	
	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*2.54;
		return this.resultado;
	}

}
