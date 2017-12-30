package br.com.smarthouse.controleclimatico.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controleclimatico.business.TemperaturaAmbienteService;
import br.com.smarthouse.controleclimatico.model.TemperaturaAmbiente;
import br.com.smarthouse.controleclimatico.persistence.TemperaturaAmbienteDAO;

@Service
public class TemperaturaAmbienteServiceImpl implements TemperaturaAmbienteService {
	
	@Autowired
	private TemperaturaAmbienteDAO temperaturaDAO;

	@Override
	public TemperaturaAmbiente create(final TemperaturaAmbiente temperaturaAmbiente) {
		temperaturaDAO.save(temperaturaAmbiente);
		return temperaturaAmbiente;
	}

}
