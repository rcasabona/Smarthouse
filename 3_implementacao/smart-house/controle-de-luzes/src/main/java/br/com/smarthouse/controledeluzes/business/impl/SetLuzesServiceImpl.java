package br.com.smarthouse.controledeluzes.business.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.ComponentesService;
import br.com.smarthouse.controledeluzes.business.ObjetoService;
import br.com.smarthouse.controledeluzes.business.SetLuzesService;
import br.com.smarthouse.controledeluzes.model.Ligado;
import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;
import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzes;
import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzesObjeto;
import br.com.smarthouse.controledeluzes.persistence.SetLuzesDAO;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

@Service
public class SetLuzesServiceImpl implements SetLuzesService {
	
	@Autowired
	private SetLuzesDAO setLuzesDAO;
	
	@Autowired
	private ComponentesService componentesService;
	
	@Autowired
	private ObjetoService objetoService;

	@Override
	public SetLuzes findOne(final Long idSetLuzes) {
		return setLuzesDAO.findOne(idSetLuzes);
	}

	@Override
	public void save(final SetLuzes setLuzes) {
		setLuzesDAO.save(setLuzes);
	}

	@Override
	public boolean executaOSetDeLuzes(final Long idSetLuzes) {
		// lista de SetLuzesObjeto
		final Set<SetLuzesObjeto> setLuzesObjetos = this.findOne(idSetLuzes).getObjetos();
		// itera pela lista
		for (SetLuzesObjeto setLuzesObjeto : setLuzesObjetos) {
			final Objeto objeto = setLuzesObjeto.getObjeto();
			// Liga/Desliga a luz
			executaAcaoPassadaPeloObjeto(objeto);
		}
		
		return false;
	}

	private void executaAcaoPassadaPeloObjeto(final Objeto objeto) {
		// recupera o estado do objeto
		final boolean objetoLigado = objetoService.verificaSeObjetoEstaLigado(objeto);
		
		if (objetoLigado) {
			// salva novo estado do objeto
			objeto.setLigado(Ligado.NAO);
			objetoService.save(objeto);
			componentesService.iteraSobreOsComponentes(objeto.getComponente(), LigarDesligar.DESLIGAR);
		}
		else {
			// salva novo estado do objeto
			objeto.setLigado(Ligado.SIM);
			objetoService.save(objeto);
			componentesService.iteraSobreOsComponentes(objeto.getComponente(), LigarDesligar.LIGAR);
		}
	}

	@Override
	public List<SetLuzes> findAll() {
		return setLuzesDAO.findAll();
	}

}
