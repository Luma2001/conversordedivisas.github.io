package conversoresVarios.domains.temperaturas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class FaC extends Resultado implements Convertir
{
	public FaC() {
		super();
		
	}

	@Override
	public double calcular(double monto) {
		this.resultado =(monto-32)*(5/9);
		return this.resultado;
	}

	

}
