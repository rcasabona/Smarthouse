package br.com.smarthouse.controledeluzes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.model.SubAmbiente;

@Controller
@RequestMapping("/subAmbientes")
public class SubAmbienteController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SubAmbiente> list() {
		return montaListaDeSubAmbientes();
	}
	
	private List<SubAmbiente> montaListaDeSubAmbientes() {
		List<SubAmbiente> subAmbientes = new ArrayList<SubAmbiente>();
		return subAmbientes;
	}

}
