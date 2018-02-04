package br.com.smarthouse.controledeluzes.business;

import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

public interface ExecutorPlacaService {
	
	public void executaAcao(final String pino, final LigarDesligar acao);

}
