package br.com.smarthouse.controledeluzes.business;

public interface ConfiguracoesDeAmbienteService {

	/**
	 * liga/desliga luzes de acordo com as configuracoes passadas
	 * 
	 * @param configuracoesDeAmbiente
	 */
	public void aplicaConfiguracao(final Long idConfiguracoesDeAmbiente);

}
