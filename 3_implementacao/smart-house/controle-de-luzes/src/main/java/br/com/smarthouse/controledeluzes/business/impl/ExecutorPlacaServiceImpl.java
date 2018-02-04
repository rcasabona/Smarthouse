package br.com.smarthouse.controledeluzes.business.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.smarthouse.controledeluzes.business.ExecutorPlacaService;
import br.com.smarthouse.controledeluzes.util.BasePropertiesUtil;
import br.com.smarthouse.controledeluzes.vo.LigarDesligar;

@Service
public class ExecutorPlacaServiceImpl implements ExecutorPlacaService {

	@Override
	public void executaAcao(final String pino, final LigarDesligar acao) {
		// uri interna do Arduino
		final String acaoURI = (acao.equals(LigarDesligar.LIGAR)) ? "ligar" : "desligar";
		final String chamada = BasePropertiesUtil.getURICoreArduino() + "pinoSaidaPWM/" + acaoURI + "/porta/" + pino + "/";
		final RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForObject(chamada, Void.class);
	}

}
