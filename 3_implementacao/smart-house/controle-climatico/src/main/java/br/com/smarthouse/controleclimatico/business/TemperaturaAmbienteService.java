package br.com.smarthouse.controleclimatico.business;

import br.com.smarthouse.controleclimatico.model.TemperaturaAmbiente;

public interface TemperaturaAmbienteService {
	
	/**
	 * Regra de negócio que cria uma nova temperatura ambiente
	 * 
	 * @param temperaturaAmbiente
	 * @return
	 */
	public TemperaturaAmbiente create(final TemperaturaAmbiente temperaturaAmbiente);

}
