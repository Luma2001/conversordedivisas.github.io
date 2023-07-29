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
		super.resultado =((monto-32.0)*(5.0/9.0));
		return super.resultado;
	}

	

}
