package br.com.smarthouse.corearduino.business.exception;

import static br.com.smarthouse.modelgenerics.util.MensagemUtil.obtemMensagem;
import static br.com.smarthouse.modelgenerics.util.MensagemUtil.MensagemEnum.NEGOCIO_ERRO_0001;

public class PortaNaoEncontradaNegocioRuntimeException extends NegocioRuntimeException {

	/**
	 * Serial gerado.
	 */
	private static final long serialVersionUID = 9050312097504654671L;
	
	public PortaNaoEncontradaNegocioRuntimeException(final String porta, final String tipo) {
		super(obtemMensagem(NEGOCIO_ERRO_0001, porta, tipo));
	}
	
	public PortaNaoEncontradaNegocioRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

}
