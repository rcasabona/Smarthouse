package br.com.smarthouse.controledeluzes.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.controledeluzes.business.ConfiguracoesDeAmbienteService;
import br.com.smarthouse.controledeluzes.model.Ambiente;
import br.com.smarthouse.controledeluzes.model.ConfiguracoesDeAmbiente;
import br.com.smarthouse.controledeluzes.model.Ligado;
import br.com.smarthouse.controledeluzes.model.Objeto;
import br.com.smarthouse.controledeluzes.model.SubAmbiente;
import br.com.smarthouse.controledeluzes.persistence.ConfiguracoesDeAmbienteDAO;
import br.com.smarthouse.controledeluzes.persistence.ObjetoDAO;

@Service
public class ConfiguracoesDeAmbienteServiceImpl implements ConfiguracoesDeAmbienteService {
	
	@Autowired
	private ConfiguracoesDeAmbienteDAO configuracoesDeAmbienteDAO;
	
	@Autowired
	private ObjetoDAO objetoDAO;

	@Override
	public void aplicaConfiguracao(final Long idConfiguracoesDeAmbiente) {
		// recupera a configuracao
		ConfiguracoesDeAmbiente configuracoesDeAmbiente = configuracoesDeAmbienteDAO.findOne(idConfiguracoesDeAmbiente);
		// aplica configuracao
		aplicaConfiguracao(configuracoesDeAmbiente);
	}

	private void aplicaConfiguracao(final ConfiguracoesDeAmbiente configuracoesDeAmbiente) {
		final List<Ambiente> ambientes = configuracoesDeAmbiente.getAmbientes();
		// itera sobre a lista de ambientes
		for (final Ambiente ambiente : ambientes) {
			final List<SubAmbiente> subAmbientes = ambiente.getSubAmbientes();
			//itera sobre a lista de subAmbientes
			for  (final SubAmbiente subAmbiente : subAmbientes) {
				final List<Objeto> objetos = subAmbiente.getObjetos();
				// desliga as luzes que não fazem parte da configuracao
				desligaLuzesForaDaConfiguracao(buscaObjetosQueNaoEstaoNaConfiguracao(subAmbiente));
				// itera sobre a lista de objetos
				for (final  Objeto objeto : objetos) {
					if (objeto.getLigado().name().equals(Ligado.NAO))
						ligaObjeto(objeto);
				}
			}
		}
	}

	private List<Objeto> buscaObjetosQueNaoEstaoNaConfiguracao(final SubAmbiente subAmbiente) {
		return null;
	}

	private void desligaLuzesForaDaConfiguracao(final List<Objeto> objetos) {

	}

	private void ligaObjeto(final Objeto objeto) {
		// :TODO puxar metodo que liga o objeto
		objeto.setLigado(Ligado.SIM);
		objetoDAO.save(objeto);
	}
	
	private void desligaObjeto(final Objeto objeto) {
		
	}

}
