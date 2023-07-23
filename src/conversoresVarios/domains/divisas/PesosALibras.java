package conversoresVarios.domains.divisas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PesosALibras extends Resultado implements Convertir{

	public PesosALibras() {
		super();
		
	}
	
	/**
	 * Método de la interfaz ConvertirDivisa
	 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto*0.00299997;
		return this.resultado;
	}

}
