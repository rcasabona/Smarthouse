package br.com.smarthouse.corearduino.business.exception;

/**
 * Esxeção padrão para a camada de negócio. Lançada em situações passíveis de
 * tratamento
 * 
 * @author Rafael Casabona
 *
 */
public abstract class NegocioException extends Exception {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = 8797558123670731637L;

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
		// TODO Auto-generated constructor stub
	}

}
