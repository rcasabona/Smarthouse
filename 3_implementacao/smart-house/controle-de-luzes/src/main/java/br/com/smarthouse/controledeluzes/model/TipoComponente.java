package br.com.smarthouse.controledeluzes.model;

public enum TipoComponente {
	
	SENSOR_PRESENCA("Sensor de Presença"), SENSOR_DE_LUMINOSIDADE("Sensor de Luminosidade"), RELE("Relé");
	
	private TipoComponente(final String nome) {
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
