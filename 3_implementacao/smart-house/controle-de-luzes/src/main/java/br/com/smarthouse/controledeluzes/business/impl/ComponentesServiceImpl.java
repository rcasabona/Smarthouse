package br.com.smarthouse.controledeluzes.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.ComponentesService;
import br.com.smarthouse.controledeluzes.business.ExecutorPlacaService;
import br.com.smarthouse.controledeluzes.model.Componente;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

@Service
public class ComponentesServiceImpl implements ComponentesService {
	
	@Autowired
	private ExecutorPlacaService executorPlacaService;

	@Override
	public void iteraSobreOsComponentes(final List<Componente> componentes, final LigarDesligar acao) {
		for ( Componente componente : componentes ) {
			executorPlacaService.executaAcao(componente.getPorta(), acao);
		}
	}

}
