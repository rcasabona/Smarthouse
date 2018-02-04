package br.com.smarthouse.controledeluzes.util;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.smarthouse.controledeluzes.vo.EnumAmbiente;
import br.com.smarthouse.controledeluzes.vo.EnumProperties;

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
	 * metodo responsavel por recuperar a url do Core do Arduino
	 * 
	 * @throws Exception
	 * @since 14/01/2018
	 */
	public static String getURICoreArduino() {
		String uriArduino = "";
		try {
			uriArduino = getEstruturaProperties(EnumAmbiente.URI_COREARDUINO);
		} catch (final Exception e) {
			LOG.error(e);
		}
		return uriArduino;
	}

}
