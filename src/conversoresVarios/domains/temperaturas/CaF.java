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
		super.resultado =(monto*(9.0/5.0)+32.0);
		return super.resultado;
	}

	//atributo
	

	

}
