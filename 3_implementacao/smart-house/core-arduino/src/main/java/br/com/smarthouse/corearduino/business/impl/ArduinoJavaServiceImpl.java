package br.com.smarthouse.corearduino.business.impl;

import java.net.ConnectException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.smarthouse.corearduino.business.ArduinoJavaService;
import br.com.smarthouse.corearduino.util.BasePropertiesUtil;
import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

@Service
public class ArduinoJavaServiceImpl implements ArduinoJavaService {

	@Override
	public void executaAcaoNoArduino(final String pino, final LigarDesligar acao) throws ConnectException {
		// uri interna do Arduino
		final String chamada = BasePropertiesUtil.getURIArduino() + pino + "/" + acao.getIdentificador();
		final RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject(chamada, Void.class);
	}

}
