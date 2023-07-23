package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class YenAPesos extends Resultado implements Convertir {

	public YenAPesos() {
		super();
	}

	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*1.82717;
		return this.resultado;
	}


}
