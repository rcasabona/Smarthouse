package br.com.smarthouse.controledeluzes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.AmbienteCustomizadoService;

@Controller
@RequestMapping("/ambienteCustomizado")
public class AmbienteCustomizadoController {
	
	@Autowired
	private AmbienteCustomizadoService ambienteCustomizadoService;
	
	@RequestMapping(value = "/{idConfiguracoesDeAmbiente}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody void aplicaConfiguracao(final @PathVariable Long idConfiguracoesDeAmbiente) {
		ambienteCustomizadoService.getAmbienteCustomizadoById(idConfiguracoesDeAmbiente);
	}

}
