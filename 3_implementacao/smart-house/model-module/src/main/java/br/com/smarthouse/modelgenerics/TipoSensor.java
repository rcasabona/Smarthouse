package br.com.smarthouse.modelgenerics;

public enum TipoSensor {
	
	SENSOR_PRESENCA("Sensor de Presença"),  SENSOR_DE_LUMINOSIDADE("Sensor de Luminosidade");
	
	private TipoSensor(final String nome) {
		this.nome = nome;
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
