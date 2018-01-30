package br.com.smarthouse.controledeluzes.business;

import java.util.List;

import br.com.smarthouse.controledeluzes.model.SubAmbiente;

public interface SubAmbienteService {
	
	public List<SubAmbiente> findByIdAmbiente(final Long idAmbiente);

}
