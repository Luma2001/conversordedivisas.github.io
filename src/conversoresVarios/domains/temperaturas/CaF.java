package conversoresVarios.domains.temperaturas;

import conversoresVarios.domains.Convertir;
import conversoresVarios.domains.Resultado;

public class CaF extends Resultado implements Convertir

{

	public CaF() {
		super();
		
	}

	@Override
	public double calcular(double monto) {
		this.resultado =monto*(9/5)+32;
		return this.resultado;
	}

	//atributo
	

	

}
