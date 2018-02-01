package br.com.smarthouse.controledeluzes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.ConfiguracoesDeAmbienteService;
import br.com.smarthouse.controledeluzes.model.ConfiguracoesDeAmbiente;

@Controller
@RequestMapping("/configuracoesDeAmbiente")
public class ConfiguracoesDeAmbienteController {
	
	@Autowired
	private ConfiguracoesDeAmbienteService configuracoesDeAmbienteService;
	
	@RequestMapping(value = "/aplicaConfiguracao/{configuracoesDeAmbiente}/", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody void aplicaConfiguracao(final @PathVariable Long idConfiguracoesDeAmbiente) {
		configuracoesDeAmbienteService.aplicaConfiguracao(configuracoesDeAmbiente);
	}

}
