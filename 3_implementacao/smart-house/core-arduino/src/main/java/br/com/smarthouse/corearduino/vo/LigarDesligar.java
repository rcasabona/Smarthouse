package br.com.smarthouse.corearduino.vo;

/**
 * Enum que representa um pino ligado ou desligado
 * 
 * @author Rafael Casabona
 *
 */
public enum LigarDesligar {
	
	LIGAR("HIGH"), DESLIGAR("LOW");
	
	private LigarDesligar(final String _identificador) {
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
