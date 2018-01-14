package br.com.smarthouse.modelgenerics.util;

/**
 * Classe utilitária para obtém de mensagens do arquivo de mensagens.
 * 
 * @author Rafael Casabona
 * 
 */
public class MensagemUtil {

	/** Arquivo de mensagens para este módulo. */
	private static final String ARQUIVO_RESOURCE_FS = "negocio-mensagens";

	/**
	 * Construtor padrão.
	 */
	private MensagemUtil() {
	}

	/**
	 * Obtém uma mensagem do arquivo de mensagens.
	 * 
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @param parametros
	 *            parâmetros parâmetros a serem enviados á mensagem.
	 * @return mensagem formatada.
	 */
	public static String obtemMensagem(MensagemEnum chaveMensagem, Object... parametros) {
		return MessageResourceUtil.getMessageResource(ARQUIVO_RESOURCE_FS, chaveMensagem, parametros);
	}

	/**
	 * Obtém uma mensagem do arquivo de mensagens.
	 * 
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @return mensagem formatada.
	 */
	public static String obtemMensagem(MensagemEnum chaveMensagem) {
		return MessageResourceUtil.getMessageResource(ARQUIVO_RESOURCE_FS, chaveMensagem, null);
	}

	/**
	 * Enum com as possíveis mensagens.
	 * 
	 * @author emarineli
	 * 
	 */
	public enum MensagemEnum {

		/* Erros */
		NEGOCIO_ERRO_0001, NEGOCIO_ERRO_0002, NEGOCIO_ERRO_0003, NEGOCIO_ERRO_0004, NEGOCIO_ERRO_0005, 
		NEGOCIO_ERRO_0006, NEGOCIO_ERRO_0007, NEGOCIO_ERRO_0008, NEGOCIO_ERRO_0009, NEGOCIO_ERRO_0010;

	}
}