package conversoresVarios.domains.longitud;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class KmAMilla extends Resultado implements Convertir {

	public KmAMilla() {
		super();
	}
	
	
/**
 * Método de la interfaz ConvertirDivisa
 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto/1.609;
		return this.resultado;
	}


	
}
