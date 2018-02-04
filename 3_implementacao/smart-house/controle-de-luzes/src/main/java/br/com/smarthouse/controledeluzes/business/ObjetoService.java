package br.com.smarthouse.controledeluzes.business;

import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;

public interface ObjetoService {
	
	/**
	 * Verifica se o objeto esta ligado
	 * 
	 * @param idObjeto
	 * @return
	 */
	public boolean verificaSeObjetoEstaLigado(final Objeto objeto);
	
	public void ligaDesliga(final Long idObjeto);

}
