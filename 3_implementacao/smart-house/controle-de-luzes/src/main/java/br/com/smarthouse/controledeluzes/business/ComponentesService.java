package br.com.smarthouse.controledeluzes.business;

import java.util.List;

import br.com.smarthouse.controledeluzes.model.Componente;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

public interface ComponentesService {
	
	/**
	 * Executa acao na lista de componentes
	 * 
	 * @param componentes
	 * @param acao
	 */
	public void iteraSobreOsComponentes(final List<Componente> componentes, final LigarDesligar acao);

}
