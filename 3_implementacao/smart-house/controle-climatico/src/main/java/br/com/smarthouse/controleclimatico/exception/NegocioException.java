package br.com.smarthouse.controleclimatico.exception;

/**
 * Exceção padrão para a camada de negócio. Lançada em situações passíveis de
 * tratamento.
 * 
 * @author Rafael Casabona
 *
 */
public abstract class NegocioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5479371495880649107L;

	/**
	 * Construtor padrão.
	 * 
	 * @param message
	 *            mensagem de erro.
	 * @param cause
	 *            causa.
	 */
	public NegocioException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor.
	 * 
	 * @param message
	 *            mensagem de erro.
	 */
	public NegocioException(final String message) {
		super(message);
	}

}
