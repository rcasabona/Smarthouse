package br.com.smarthouse.corearduino.vo;

/**
 * Enum que representa um pino ligado ou desligado
 * 
 * @author Rafael Casabona
 *
 */
public enum LigadoDesligado {
	
	LIGADO("HIGH"), DESLIGADO("LOW");
	
	private LigadoDesligado(final String _identificador) {
		this.identificador = _identificador;
	}
	
	private String identificador;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
