package conversoresVarios.aplications.divisas;



public enum EnumDivisa {
	PESOS_A_DOLAR("de Pesos a Dólar"), 
	PESOS_A_EURO("de Pesos a Euro"),
	PESOS_A_LIBRAS("de Pesos a Libras"),
	PESOS_A_YEN("de Pesos a Yen"),
	PESOS_A_WON_COREANO("de Pesos a Won Coreano"),
	DOLAR_A_PESOS("de Dólar a Pesos"),
	EURO_A_PESOS("de Euro a Pesos"),
	LIBRAS_A_PESOS("de Libras a Pesos"),
	YEN_A_PESOS("de Yen a Pesos"),
	WON_COREANO_A_PESOS("de Won Coreano a Pesos");
	
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
