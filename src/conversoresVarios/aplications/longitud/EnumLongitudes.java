package conversoresVarios.aplications.longitud;

public enum EnumLongitudes {
	CM_A_PULGADA(" pulgada"),
	PULGADA_A_CM(" centimetro"),
	METRO_A_PULGADA(" pulgada"),
	PULGADA_A_METRO(" metro"),
	METRO_A_YARDA(" yarda"),
	YARDA_A_METRO(" metro"),
	KM_A_MILLA(" milla"),
	MILLA_A_KM(" kilometro");
	
	//Atributo
	public String value;
	
	//Constructor
	private EnumLongitudes(String value) {
		this.value = value;
	}
	//getter
		public String getValue() {
			return value;
		}

}
