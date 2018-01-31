package br.com.smarthouse.controledeluzes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.smarthouse.controledeluzes.business.AmbienteService;
import br.com.smarthouse.controledeluzes.model.Ambiente;
import br.com.smarthouse.controledeluzes.model.Luz;
import br.com.smarthouse.controledeluzes.model.SubAmbiente;
import br.com.smarthouse.controledeluzes.model.TipoAmbiente;

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
	public @ResponseBody Ambiente ambiente(final @PathVariable int idAmbiente) {
		return montaListaDeAmbiente();
	}
	
	@RequestMapping(value = "/{idAmbiente}/list/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Ambiente> list(@PathVariable("idAmbiente") final Long idAmbiente) {
		return ambienteService.findByIdAmbiente(idAmbiente);
	}
	
	private List<Ambiente> montaListaDeAmbientes() {
		final List<Ambiente> ambientes = ambienteService.list();
		return ambientes;
	}
	
	private Ambiente montaListaDeAmbiente() {
		final Ambiente ambiente = new Ambiente();
		ambiente.setDescricao("");
		ambiente.setTipoAmbiente(TipoAmbiente.AREA_GOURMET);
		
		final List<SubAmbiente> subAmbientes = new ArrayList<SubAmbiente>();
		
		// Ambiente 1
		final SubAmbiente subAmbiente1 = new SubAmbiente();
		subAmbiente1.setId(1L);
		subAmbiente1.setTipoAmbiente(TipoAmbiente.SALA_DE_ESTAR);
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
//		subAmbiente1.setLuzes(luzes1);
		
		// Ambiente 2
		final SubAmbiente subAmbiente2 = new SubAmbiente();
		subAmbiente2.setId(1L);
		subAmbiente2.setTipoAmbiente(TipoAmbiente.SALA);
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
//		subAmbiente2.setLuzes(luzes2);
		
		// add ambientes
		subAmbientes.add(subAmbiente1);
		subAmbientes.add(subAmbiente2);
		
//		ambiente.setSubAmbientes(subAmbientes);
		return ambiente;
	}
}
