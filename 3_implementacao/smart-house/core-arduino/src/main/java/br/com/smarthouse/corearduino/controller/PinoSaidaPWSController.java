package br.com.smarthouse.corearduino.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import br.com.smarthouse.corearduino.vo.Camera;
import br.com.smarthouse.corearduino.vo.pinos.PinoSaidaPWM;

@Controller
@RequestMapping("/pinoSaidaPWS")
public class PinoSaidaPWSController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String lerValorPinoPWM(final @RequestParam PinoSaidaPWM pinoPWM) {
		final String urlChamada = "" + pinoPWM;
		return null;
	}

	@RequestMapping(value = "/ligar", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Camera ligarPinoSaidaPWM() {
		
		
		
	    final String uri = "http://localhost:3000/cameras";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    Camera camera = restTemplate.getForObject(uri, Camera.class);
	    
	    return camera;
		
		
	}
	

	@RequestMapping(value = "/desligar", method = RequestMethod.POST, produces = "application/json")
	public void desligarPinoSaidaPWM(final @RequestParam PinoSaidaPWM pinoPWM) {
		
	}

}
