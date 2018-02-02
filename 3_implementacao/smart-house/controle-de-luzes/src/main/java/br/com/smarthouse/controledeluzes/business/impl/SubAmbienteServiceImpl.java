package br.com.smarthouse.controledeluzes.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.SubAmbienteService;
import br.com.smarthouse.controledeluzes.model.ambiente.SubAmbiente;
import br.com.smarthouse.controledeluzes.persistence.SubAmbienteDAO;

@Service
public class SubAmbienteServiceImpl implements SubAmbienteService {
	
	@Autowired
	private SubAmbienteDAO subAmbienteDAO;

	@Override
	public List<SubAmbiente> findByIdAmbiente(final Long idAmbiente) {
		return subAmbienteDAO.findByIdAmbiente(idAmbiente);
	}

}
