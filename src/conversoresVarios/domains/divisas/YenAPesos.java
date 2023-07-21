package conversoresVarios.domains.divisas;

import conversoresVarios.domains.ConvertirDivisa;
import conversoresVarios.domains.Divisa;

public class YenAPesos extends Divisa implements ConvertirDivisa {

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
