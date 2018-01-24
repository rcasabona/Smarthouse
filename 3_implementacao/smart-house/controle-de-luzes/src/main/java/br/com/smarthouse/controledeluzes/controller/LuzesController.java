package br.com.smarthouse.controledeluzes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

@Controller
@RequestMapping("/luzes")
public class LuzesController {
	
	@RequestMapping(value = "/desligar/{rele}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody LigarDesligar desligar(@PathVariable("rele") String porta) {
		return LigarDesligar.DESLIGAR;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody LigarDesligar luzesTeste() {
		return LigarDesligar.DESLIGAR;
	}

}
