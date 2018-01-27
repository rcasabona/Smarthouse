package br.com.smarthouse.controledeluzes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.model.Luz;
import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

@Controller
@RequestMapping("/luzes")
public class LuzesController {
	
	@RequestMapping(value = "/desligar/{rele}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody LigarDesligar desligar(@PathVariable("rele") String porta) {
		return LigarDesligar.DESLIGAR;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Luz> listaLuzes() {
		return montaRetornoLuzes();
	}
	
	private List<Luz> montaRetornoLuzes() {
		List<Luz> luzes = new ArrayList<Luz>();
		
		Luz luz = new Luz();
		luz.setId(1L);
		luz.setNome("Sanca 1");
		luz.setPorta(1);
		luzes.add(luz);
		
		Luz luz2 = new Luz();
		luz2.setId(2L);
		luz2.setNome("Sanca 2");
		luz2.setPorta(2);
		luzes.add(luz2);
		
		return luzes;
	}

}
