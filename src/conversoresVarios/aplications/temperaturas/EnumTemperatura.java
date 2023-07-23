package conversoresVarios.aplications.temperaturas;

public enum EnumTemperatura {
	CELSIUS_A_FAHRENHEIT("de Celsius a Fahrenheit"),
	FAHRENHEINT_A_CELSIUS("de Fahrenheit a Celsius");
	
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
