package br.com.smarthouse.corearduino.controller;

import java.net.ConnectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import br.com.smarthouse.corearduino.business.PinoSaidaPWMService;
import br.com.smarthouse.corearduino.util.BasePropertiesUtil;
import br.com.smarthouse.corearduino.vo.AcaoRetorno;
import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

/**
 * Controller que lida com acões nas entradas PWS do Arduino
 * 
 * @author Rafael Casabona
 * @since 14/01/2018
 * 
 */
@Controller
@RequestMapping("/pinoSaidaPWM")
public class PinoSaidaPWMController {

	@Autowired
	private PinoSaidaPWMService pinoSaidaPWMService;

	@RequestMapping(value = "/ligar/porta/{porta}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody AcaoRetorno ligar(@PathVariable("porta") String porta) {
		final AcaoRetorno retorno = verificaSePortaExiste(porta);
		// trata chamada ao Arduino
		try {
			// executa ação no Arduino
			executaAcaoNoArduino(porta, LigarDesligar.LIGAR);
			retorno.setSucesso(true);
		} catch (ConnectException e) {
			retorno.setErro(e.getMessage());
		}
		// retorno
		return retorno;
	}

	@RequestMapping(value = "/desligar/porta/{porta}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody AcaoRetorno desligar(@PathVariable("porta") String porta) {
		final AcaoRetorno retorno = verificaSePortaExiste(porta);
		// trata chamada ao Arduino
		try {
			// executa ação no Arduino
			executaAcaoNoArduino(porta, LigarDesligar.DESLIGAR);
			retorno.setSucesso(true);
		} catch (ConnectException e) {
			retorno.setErro(e.getMessage());
		}
		// retorno
		return retorno;
	}

	/**
	 * Executa acão no Arduino
	 * 
	 * @param pino
	 */
	private void executaAcaoNoArduino(final String pino, final LigarDesligar acao) throws ConnectException {
		// uri interna do Arduino
		final String chamada = BasePropertiesUtil.getURIArduino() + pino + "/" + acao.getIdentificador();
		final RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject(chamada, Void.class);
	}

	/**
	 * verifica se a porta existe, caso não exista lança uma exception do tipo
	 * RuntimeException, pois o programa não deve tratar um erro deste tipo
	 * 
	 * @param porta
	 * @return
	 */
	private AcaoRetorno verificaSePortaExiste(final String porta) {
		// verifica se a porta existe na placa
		pinoSaidaPWMService.portaExiste(porta);
		// monta objeto de retorno
		final AcaoRetorno retorno = new AcaoRetorno();
		retorno.setSucesso(false);
		// retorno
		return retorno;
	}

}
