package br.com.smarthouse.corearduino.business;

import br.com.smarthouse.corearduino.vo.AcaoRetorno;

/**
 * Trata os serviços para as portas PWM
 * 
 * @author Rafael Casabona
 *
 */
public interface PinoSaidaPWMService {

	/**
	 * Aciona Objeto que esta na porta
	 * 
	 * @param porta
	 * @return
	 */
	public AcaoRetorno ligar(final String porta);
	
	/**
	 * @param porta
	 * @return
	 */
	public AcaoRetorno desligar(final String porta);

	/**
	 * verifica se a porta existe, caso não exista lança uma exception do tipo
	 * RuntimeException, pois o programa não deve tratar um erro deste tipo
	 * 
	 * @param porta
	 * @return
	 */
	public AcaoRetorno verificaSePortaExiste(final String porta);

}
