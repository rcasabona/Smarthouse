package br.com.smarthouse.corearduino.business;

import java.net.ConnectException;

import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

public interface ArduinoJavaService {
	
	/**
	 * executa acao no Arduino
	 * 
	 * @param pino
	 * @param acao
	 * @throws ConnectException
	 */
	public void executaAcaoNoArduino(final String pino, final LigarDesligar acao) throws ConnectException;

}
