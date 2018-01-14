package br.com.smarthouse.corearduino.business;

/**
 * Trata os serviços para as portas PWM
 * 
 * @author Rafael Casabona
 *
 */
public interface PinoSaidaPWMService {

	/**
	 * Verifica se a porta existe.
	 * 
	 * @return String
	 */
	public String portaExiste(final String porta);

}
