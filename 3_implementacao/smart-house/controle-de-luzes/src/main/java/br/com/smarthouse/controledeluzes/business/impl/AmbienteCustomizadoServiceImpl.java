package br.com.smarthouse.controledeluzes.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.AmbienteCustomizadoService;
import br.com.smarthouse.controledeluzes.model.ambientecustomizado.AmbienteCustomizado;
import br.com.smarthouse.controledeluzes.persistence.AmbienteCustomizadoDAO;

@Service
public class AmbienteCustomizadoServiceImpl implements AmbienteCustomizadoService {
	
	@Autowired
	private AmbienteCustomizadoDAO ambienteCustomizadoDAO;

	@Override
	public void aplicaConfiguracao(final Long idAmbienteCustomizado) {
	}

	@Override
	public AmbienteCustomizado getAmbienteCustomizadoById(final Long idAmbienteCustomizado) {
		return ambienteCustomizadoDAO.getOne(idAmbienteCustomizado);
	}

}
