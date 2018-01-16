package br.com.smarthouse.modelgenerics.vo;

public class LeituraAmbienteDTO {
	
	public LeituraAmbienteDTO() {}
	
	public LeituraAmbienteDTO(final Double _ambiente, final Double _temperatura) {
		this.ambiente = _ambiente;
		this.temperatura = _temperatura;
	}
	
	private Double ambiente;
	
	private Double temperatura;

	public Double getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Double ambiente) {
		this.ambiente = ambiente;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

}
