package conversoresVarios.aplications.temperaturas;

public enum EnumTemperatura {
	CELSIUS_A_FAHRENHEIT(" Fahrenheit"),
	FAHRENHEINT_A_CELSIUS(" Celsius");
	
		//Atributo
		public String value;
	
		//Constructor	
		private EnumTemperatura(String value) {
				this.value = value;
			}

		//getter
		public String getValue() {
			return value;
		}
	

}
