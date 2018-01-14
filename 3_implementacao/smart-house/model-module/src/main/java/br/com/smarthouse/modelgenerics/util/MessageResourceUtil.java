package br.com.smarthouse.modelgenerics.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Responsável por fornecer acesso a arquivos de mensagens.
 * 
 * @author emarineli
 * 
 */
public class MessageResourceUtil {

	/** Locale padrão. */
	private static final Locale DEFAUL_LOCALE = new Locale("pt", "BR");

	/**
	 * Construtor padrão.
	 */
	private MessageResourceUtil() {
	}

	/**
	 * Obtem o classloader para encontrar o arquivo de mensagens.
	 * 
	 * Inicialmente será obtido o classloader do nível mais alto da hierarquia.
	 * Caso não for encontrado, o objeto padrão é utilizado.
	 * 
	 * @param defaultObject
	 *            objeto padrão para busca do classloader associado.
	 * @return classloader para referenciar o arquivo de mensagens.
	 */
	protected static ClassLoader getCurrentClassLoader(Object defaultObject) {

		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		if (loader == null && defaultObject != null) {
			loader = defaultObject.getClass().getClassLoader();
		}

		return loader;
	}

	/**
	 * Obtém uma mensagem do bundle pela sua chave de mensagem e os parâmetros
	 * que podem compor a mensagem.
	 * 
	 * @param nomeArquivoBundle
	 *            nome do arquivo de mensagens.
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @param params
	 *            parâmetros que podem ser passados a uma mensagem.
	 * @return mensagem do bundle.
	 */
	public static String getMessageResource(String nomeArquivoBundle,
			Enum<?> chaveMensagem, Object[] params) {

		return getMessageResource(nomeArquivoBundle, chaveMensagem, params,
				DEFAUL_LOCALE);
	}
	
	/**
	 * Obtém uma mensagem do bundle pela sua chave de mensagem e os parâmetros
	 * que podem compor a mensagem.
	 * 
	 * @param nomeArquivoBundle
	 *            nome do arquivo de mensagens.
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @param params
	 *            parâmetros que podem ser passados a uma mensagem.
	 * @return mensagem do bundle.
	 */
	public static String getMessageResourceSemChaveMensagem(String nomeArquivoBundle,
			Enum<?> chaveMensagem, Object[] params) {

		return getMessageResourceWithoutKey(nomeArquivoBundle, chaveMensagem, params,
				DEFAUL_LOCALE);
	}

	/**
	 * Obtém uma mensagem do bundle pela sua chave de mensagem e os parâmetros
	 * que podem compor a mensagem.
	 * 
	 * @param nomeArquivoBundle
	 *            nome do arquivo de mensagens.
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @param params
	 *            parâmetros que podem ser passados a uma mensagem.
	 * @param locale
	 *            locale.
	 * @return mensagem do bundle.
	 */
	public static String getMessageResource(String nomeArquivoBundle,
			Enum<?> chaveMensagem, Object[] params, Locale locale) {

		String mensagem = null;

		/* obtém o bundle de mensagens. */
		ResourceBundle bundle = ResourceBundle.getBundle(nomeArquivoBundle,
				locale, getCurrentClassLoader(params));

		if (bundle != null) {
			try {
				/* obtém texto pela chave */
				mensagem = chaveMensagem.name() + " - " + bundle.getString(chaveMensagem.name());

			} catch (MissingResourceException e) {
				mensagem = "?? chave " + chaveMensagem.name() + " não encontrado ??";
			}

			/* formata a mensagem com os parâmetros associados. */
			if (params != null) {
				MessageFormat mf = new MessageFormat(mensagem, locale);
				mensagem = mf.format(params).toString();
			}
		} else {
			mensagem = "?? Arquivo de bundle " + nomeArquivoBundle
					+ " não encontrado ??";
		}

		return mensagem;
	}
	
	/**
	 * Obtém uma mensagem do bundle pela sua chave de mensagem e os parâmetros
	 * que podem compor a mensagem.
	 * 
	 * @param nomeArquivoBundle
	 *            nome do arquivo de mensagens.
	 * @param chaveMensagem
	 *            chave da mensagem.
	 * @param params
	 *            parâmetros que podem ser passados a uma mensagem.
	 * @param locale
	 *            locale.
	 * @return mensagem do bundle.
	 */
	public static String getMessageResourceWithoutKey(String nomeArquivoBundle,
			Enum<?> chaveMensagem, Object[] params, Locale locale) {

		String mensagem = null;

		/* obtém o bundle de mensagens. */
		ResourceBundle bundle = ResourceBundle.getBundle(nomeArquivoBundle,
				locale, getCurrentClassLoader(params));

		if (bundle != null) {
			try {
				/* obtém texto pela chave */
				mensagem = bundle.getString(chaveMensagem.name());

			} catch (MissingResourceException e) {
				mensagem = "?? chave " + chaveMensagem.name() + " não encontrado ??";
			}

			/* formata a mensagem com os parâmetros associados. */
			if (params != null) {
				MessageFormat mf = new MessageFormat(mensagem, locale);
				mensagem = mf.format(params).toString();
			}
		} else {
			mensagem = "?? Arquivo de bundle " + nomeArquivoBundle
					+ " não encontrado ??";
		}

		return mensagem;
	}
}
