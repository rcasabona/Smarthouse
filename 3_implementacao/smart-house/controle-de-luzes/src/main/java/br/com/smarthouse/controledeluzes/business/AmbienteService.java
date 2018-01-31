package br.com.smarthouse.controledeluzes.business;

import java.util.List;

import br.com.smarthouse.controledeluzes.model.Ambiente;

/**
 * @author Rafael Casabona
 *
 */
public interface AmbienteService {
	
	/**
	 * retorna lista de ambientes
	 * @return
	 */
	public List<Ambiente> list();
	
	public List<Ambiente> findByIdAmbiente(final Long idAmbiente);

}
