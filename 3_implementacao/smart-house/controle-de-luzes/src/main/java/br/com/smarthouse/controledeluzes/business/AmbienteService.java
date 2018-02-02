package br.com.smarthouse.controledeluzes.business;

import java.util.List;

import br.com.smarthouse.controledeluzes.model.ambiente.Ambiente;

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
	
	public Ambiente findByIdAmbiente(final Long idAmbiente);

}
