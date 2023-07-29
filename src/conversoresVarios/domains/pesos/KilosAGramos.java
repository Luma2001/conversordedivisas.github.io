package conversoresVarios.domains.pesos;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class KilosAGramos extends Resultado implements Convertir {

	
	public KilosAGramos() {
		super();
    }

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*1000.0;
		return this.resultado;
	}

}
