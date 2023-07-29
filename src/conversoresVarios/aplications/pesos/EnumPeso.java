package conversoresVarios.aplications.pesos;

public enum EnumPeso {
	KILOS_A_LIBRAS("de Kilogramos a Libras"),
	LIBRAS_A_KILOS("de Libras a Kilogramos"),
	KILOS_A_GRAMOS("de Kilogramos a Gramos"),
	GRAMOS_A_KILOS("de Gramos a Kilogramos");

	//atributo
	public String value;
	
	//Constructor
	private EnumPeso(String value) {
		this.value=value;
	}

}
