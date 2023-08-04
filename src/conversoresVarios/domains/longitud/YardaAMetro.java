package conversoresVarios.domains.longitud;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class YardaAMetro extends Resultado implements Convertir {

	public YardaAMetro() {
		super();
	}
	

/**
 * Método de la interfaz ConvertirDivisa
 */
	@Override
	public double calcular(double monto) {
		this.resultado =monto/1.094;
		return this.resultado;
	}

}
