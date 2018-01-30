package br.com.smarthouse.controledeluzes.model;

/**
 * @author Rafael Casabona
 *
 */
public enum Ligado {
	
	SIM("Sim"), NAO("Não"), NA("N/A");
	
	private Ligado(final String estado) {
		this.estado = estado;
	}
	
	private String estado;

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
