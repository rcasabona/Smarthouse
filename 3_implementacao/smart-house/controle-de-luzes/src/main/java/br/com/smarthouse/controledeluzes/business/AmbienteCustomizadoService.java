package br.com.smarthouse.controledeluzes.business;

import br.com.smarthouse.controledeluzes.model.ambientecustomizado.AmbienteCustomizado;

public interface AmbienteCustomizadoService {
	
	/**
	 * liga/desliga luzes de acordo com as configuracoes passadas
	 * 
	 * @param idAmbienteCustomizado
	 */
	public void aplicaConfiguracao(final Long idAmbienteCustomizado);
	
	public AmbienteCustomizado getAmbienteCustomizadoById(final Long idAmbienteCustomizado);

}
