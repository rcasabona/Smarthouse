package br.com.smarthouse.controledeluzes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.model.Luz;
import br.com.smarthouse.controledeluzes.model.SubAmbiente;
import br.com.smarthouse.controledeluzes.model.TipoAmbiente;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

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
	
	@RequestMapping(value = "/{ambiente}/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<SubAmbiente> list(final @PathVariable("ambiente") int ambiente) {
		return montaListaDeLuzes();
	}
	
	private List<SubAmbiente> montaListaDeLuzes() {
		final List<SubAmbiente> ambientes = new ArrayList<SubAmbiente>();
		
		// Ambiente 1
		final SubAmbiente ambiente1 = new SubAmbiente();
		ambiente1.setId(1L);
		ambiente1.setTipoAmbiente(TipoAmbiente.SALA_DE_ESTAR);
		// Luzes do ambiente
		final List<Luz> luzes1 = new ArrayList<Luz>();
		final Luz luz11 = new Luz();
		luz11.setId(1l);
		luz11.setNome("Luz Sanca 1");
		luz11.setPorta(1);
		final Luz luz12 = new Luz();
		luz12.setId(2l);
		luz12.setNome("Luz Sanca 2");
		luz12.setPorta(2);
		luzes1.add(luz11);
		luzes1.add(luz12);
//		ambiente1.setLuzes(luzes1);
		
		// Ambiente 2
		final SubAmbiente ambiente2 = new SubAmbiente();
		ambiente2.setId(1L);
		ambiente2.setTipoAmbiente(TipoAmbiente.SALA);
		// Luzes do ambiente
		final List<Luz> luzes2 = new ArrayList<Luz>();
		final Luz luz21 = new Luz();
		luz21.setId(1l);
		luz21.setNome("Luz 1");
		luz21.setPorta(1);
		final Luz luz22 = new Luz();
		luz22.setId(2l);
		luz22.setNome("Luz 2");
		luz22.setPorta(2);
		luzes2.add(luz21);
		luzes2.add(luz22);
//		ambiente2.setLuzes(luzes2);
		
		// add ambientes
		ambientes.add(ambiente1);
		ambientes.add(ambiente2);
		
		return ambientes;
	}

}
