package br.com.smarthouse.controledeluzes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.AmbienteService;
import br.com.smarthouse.controledeluzes.model.Ambiente;

@Controller
@RequestMapping("/ambientes")
public class AmbienteControler {
	
	@Autowired
	private AmbienteService ambienteService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Ambiente> list() {
		return montaListaDeAmbientes();
	}
	
	@RequestMapping(value = "/{idAmbiente}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Ambiente ambiente(final @PathVariable Long idAmbiente) {
		return ambienteService.findByIdAmbiente(idAmbiente);
	}
	
	private List<Ambiente> montaListaDeAmbientes() {
		final List<Ambiente> ambientes = ambienteService.list();
		return ambientes;
	}

}
