package br.com.smarthouse.controledeluzes.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.ComponentesService;
import br.com.smarthouse.controledeluzes.business.ObjetoService;
import br.com.smarthouse.controledeluzes.model.Ligado;
import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;
import br.com.smarthouse.controledeluzes.persistence.ObjetoDAO;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

@Service
public class ObjetoServiceImpl implements ObjetoService {
	
	@Autowired
	private ObjetoDAO objetoDAO;
	
	@Autowired
	private ComponentesService componentesService;

	@Override
	public boolean verificaSeObjetoEstaLigado(final Objeto objeto) {
		return objeto.getLigado().equals(Ligado.SIM);
	}

	@Override
	public void ligaDesliga(final Long idObjeto) {
		final Objeto objeto = objetoDAO.findOne(idObjeto);
		// Desliga
		if (verificaSeObjetoEstaLigado(objeto)) {
			objeto.setLigado(Ligado.NAO);
			this.save(objeto);
			componentesService.iteraSobreOsComponentes(objeto.getComponente(), LigarDesligar.DESLIGAR);
		// Liga
		} else {
			objeto.setLigado(Ligado.SIM);
			this.save(objeto);
			componentesService.iteraSobreOsComponentes(objeto.getComponente(), LigarDesligar.LIGAR);
		}
			
	}
	
	@Override
	public void save(final Objeto objeto) {
		objetoDAO.save(objeto);
	}

}
