package br.com.smarthouse.controleclimatico.exception;

/**
 * Exceção geral para negócio específica de fluxos de erro que não são passíveis
 * de tratamento.
 * 
 * @author Rafael Casabona
 * 
 */
public abstract class NegocioRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7381011689762806036L;

	/**
	 * Construtor padrão.
	 * 
	 * @param message
	 *            mensagem de erro.
	 * @param cause
	 *            causa do erro.
	 */
	public NegocioRuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor.
	 * 
	 * @param message
	 *            mensagem de erro.
	 */
	public NegocioRuntimeException(String message) {
		super(message);
	}

}
