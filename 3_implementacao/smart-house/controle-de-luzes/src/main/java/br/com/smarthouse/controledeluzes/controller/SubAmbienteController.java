package br.com.smarthouse.controledeluzes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.SubAmbienteService;
import br.com.smarthouse.controledeluzes.model.SubAmbiente;

@Controller
@RequestMapping("/sub-ambientes")
public class SubAmbienteController {
	
	@Autowired
	private SubAmbienteService subAmbienteService;
	
	@RequestMapping(value = "/{idAmbiente}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SubAmbiente> list(@PathVariable("idAmbiente") final Long idAmbiente) {
		return subAmbienteService.findByIdAmbiente(idAmbiente);
	}

}
