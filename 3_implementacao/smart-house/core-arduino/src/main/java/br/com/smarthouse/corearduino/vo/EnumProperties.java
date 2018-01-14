package br.com.smarthouse.corearduino.vo;

public enum EnumProperties {

	AMBIENTE("/ambiente.properties");
	
	private String propriedade;

	private EnumProperties(String propriedade) {
		this.propriedade = propriedade;
	}

	/**
	 * @return the properties
	 */
	public String getPropriedade() {
		return propriedade;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setpropriedade(String propriedade) {
		this.propriedade = propriedade;
	}
}

