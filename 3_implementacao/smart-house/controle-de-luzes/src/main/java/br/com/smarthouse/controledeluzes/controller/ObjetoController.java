package br.com.smarthouse.controledeluzes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.ObjetoService;

@Controller
@RequestMapping("/objetos")
public class ObjetoController {
	
	@Autowired
	private ObjetoService objetoService;
	
	@RequestMapping(value = "/ligadesliga/{idObjeto}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody void ligaDesliga(@PathVariable("idObjeto") final Long idObjeto) {
		objetoService.ligaDesliga(idObjeto);
	}

}
