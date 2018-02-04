package br.com.smarthouse.controledeluzes.business;

import java.util.List;

import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzes;

public interface SetLuzesService {
	
	/**
	 * @param idSetLuzes
	 * @return
	 */
	public SetLuzes findOne(final Long idSetLuzes);
	
	/**
	 * Persiste a entidade SetLuzes
	 * @param setLuzes
	 */
	public void save(final SetLuzes setLuzes);
	
	/**
	 * Executa o SetLuzes informado
	 * @param setLuzes
	 * @return
	 */
	public boolean executaOSetDeLuzes(final Long idSetLuzes);
	
	public List<SetLuzes> findAll();

}
