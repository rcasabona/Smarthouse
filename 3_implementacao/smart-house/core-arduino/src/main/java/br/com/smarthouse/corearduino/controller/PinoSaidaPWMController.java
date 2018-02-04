package br.com.smarthouse.corearduino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.corearduino.business.PinoSaidaPWMService;
import br.com.smarthouse.corearduino.vo.AcaoRetorno;

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
		return pinoSaidaPWMService.ligar(porta);
	}

	@RequestMapping(value = "/desligar/porta/{porta}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody AcaoRetorno desligar(@PathVariable("porta") String porta) {
		return pinoSaidaPWMService.desligar(porta);
	}

}
