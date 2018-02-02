package br.com.smarthouse.controledeluzes.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.AmbienteService;
import br.com.smarthouse.controledeluzes.model.ambiente.Ambiente;
import br.com.smarthouse.controledeluzes.persistence.AmbienteDAO;

@Service
public class AmbienteServiceImpl implements AmbienteService {
	
	@Autowired
	private AmbienteDAO ambienteDAO;

	@Override
	public List<Ambiente> list() {
		return ambienteDAO.findAll();
	}

	@Override
	public Ambiente findByIdAmbiente(final Long idAmbiente) {
		return ambienteDAO.findByIdAmbiente(idAmbiente);
	}

}
