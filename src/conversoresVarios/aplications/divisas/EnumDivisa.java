package conversoresVarios.aplications.divisas;



public enum EnumDivisa {
	PESOS_A_DOLAR(" Dólar"), 
	PESOS_A_EURO(" Euro"),
	PESOS_A_LIBRAS(" Libras"),
	PESOS_A_YEN(" Yen"),
	PESOS_A_WON_COREANO(" Won Coreano"),
	DOLAR_A_PESOS(" Pesos"),
	EURO_A_PESOS(" Pesos"),
	LIBRAS_A_PESOS(" Pesos"),
	YEN_A_PESOS(" Pesos"),
	WON_COREANO_A_PESOS(" Pesos");
	
	//Atributo
	public String value;
	
	//Constructor
	private EnumDivisa(String value) {
		this.value = value;
	}

	//getter
	public String getValue() {
		return value;
	}


	
	

}
