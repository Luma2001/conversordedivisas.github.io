package conversoresVarios.domains.longitud;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class PulgadaAMetro extends Resultado implements Convertir{

	public PulgadaAMetro() {
		super();
	}
	

/**
 * Método de la interfaz ConvertirDivisa
 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto/39.37;
		return this.resultado;
	}

}
