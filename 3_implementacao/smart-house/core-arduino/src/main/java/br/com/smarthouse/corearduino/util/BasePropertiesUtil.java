package br.com.smarthouse.corearduino.util;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.smarthouse.corearduino.vo.EnumAmbiente;
import br.com.smarthouse.corearduino.vo.EnumProperties;

/**
 * @author Rafael Casabona
 * @since 14/01/2018
 *
 */
public class BasePropertiesUtil {
	private static Log LOG = LogFactory.getLog(BasePropertiesUtil.class);
	private static Properties estruturaProperties;
	
	private static Properties getProperties(final EnumProperties enumerador) throws Exception {
		Properties prop = new Properties();

		prop.load(BasePropertiesUtil.class.getResourceAsStream(enumerador
				.getPropriedade()));

		return prop;
	}
	
	public static String getEstruturaProperties(final EnumAmbiente enumerador) throws Exception {
		if (estruturaProperties == null) {
			estruturaProperties = getProperties(EnumProperties.AMBIENTE);
		}
		return estruturaProperties.get(enumerador.getCaminho()).toString();
	}	

	public static Properties getEstruturaProperties() throws Exception {
		if (estruturaProperties == null) {
			estruturaProperties = getProperties(EnumProperties.AMBIENTE);
		}
		return estruturaProperties;
	}
	
	/**
	 * Método responsável por recuperar o identificador da operadora ClaroTV.
	 * 
	 * @return {@link String} - retorna o identificador da operadora ClaroTV. 
	 * @throws Exception
	 * @since 14/01/2018
	 */
	public static String getURIArduino() {
		String uriArduino = "";
		try {
			uriArduino = getEstruturaProperties(EnumAmbiente.URI_ARDUINO);
		} catch (final Exception e) {
			LOG.error(e);
		}
		return uriArduino;
	}

}
