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
	
//	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
//	public @ResponseBody StatusObjetoVO luzesTeste() {
//		final StatusObjetoVO status = new StatusObjetoVO();
//		status.setEstado(LigarDesligar.DESLIGAR);
//		status.setPino(13);
//		return status;
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Luz> list() {
		return montaListaDeLuzes();
	}
	
	private List<Luz> montaListaDeLuzes() {
		List<Luz> luzes = new ArrayList<Luz>();
		
		Luz luz1 = new Luz();
		luz1.setAmbiente("sala");
		luz1.setId(1L);
		luz1.setNome("Sanca 1");
		luzes.add(luz1 );
		
		return luzes;
	}

}
