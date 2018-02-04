package br.com.smarthouse.controledeluzes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.SetLuzesService;
import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzes;

@Controller
@RequestMapping("/setLuzes")
public class SetLuzesController {
	
	@Autowired
	private SetLuzesService setLuzesService;
	
	@RequestMapping(value = "/{idSetLuzes}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody SetLuzes findOne(final @PathVariable("idSetLuzes") Long idSetLuzes) {
		final SetLuzes setLuzes = setLuzesService.findOne(idSetLuzes);
		return setLuzes;
	}
	
	@RequestMapping(value = "/executaOSetDeLuzes/{idSetLuzes}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody boolean executaOSetDeLuzes(final @PathVariable("idSetLuzes") Long idSetLuzes) {
		final boolean sucesso = setLuzesService.executaOSetDeLuzes(idSetLuzes);
		return sucesso;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SetLuzes> list() {
		return setLuzesService.findAll();
	}

}
