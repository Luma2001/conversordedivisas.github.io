package conversoresVarios.aplications.pesos;

public enum EnumPeso {
	KILOS_A_LIBRAS(" Libras"),
	LIBRAS_A_KILOS(" Kilogramos"),
	KILOS_A_GRAMOS(" Gramos"),
	GRAMOS_A_KILOS(" Kilogramos");

	//atributo
	public String value;
	
	//Constructor
	private EnumPeso(String value) {
		this.value=value;
	}

	//getter
			public String getValue() {
				return value;
			}
}
