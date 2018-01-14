package br.com.smarthouse.corearduino.business.exception;

/**
 * Exceção geral para negócio espefico de fluxos de erro que não são passíveis
 * de tratamento.
 * 
 * @author Rafael Casabona
 *
 */
public abstract class NegocioRuntimeException extends RuntimeException {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = 1794629239491132242L;

	/**
	 * Construtor padrão.
	 * 
	 * @param message
	 *            mensagem de erro.
	 * @param cause
	 *            causa do erro.
	 */
	public NegocioRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Construtor
	 * 
	 * @param message
	 *            mensagem de erro.
	 */
	public NegocioRuntimeException(final String message) {
		super(message);
	}

}
