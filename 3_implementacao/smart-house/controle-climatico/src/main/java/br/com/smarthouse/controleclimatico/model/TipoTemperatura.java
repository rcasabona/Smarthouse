package br.com.smarthouse.controleclimatico.model;

public enum TipoTemperatura {
	
	QUENTE(1), FRIO(2), AGRADAVEL(3);
	
	private TipoTemperatura(final int temperatura) {
		this.temperatura = temperatura;
	}
	
	private int temperatura;

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}
