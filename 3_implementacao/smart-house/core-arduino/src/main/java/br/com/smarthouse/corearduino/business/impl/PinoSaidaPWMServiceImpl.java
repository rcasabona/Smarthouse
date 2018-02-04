package br.com.smarthouse.corearduino.business.impl;

import java.net.ConnectException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.smarthouse.corearduino.business.ArduinoJavaService;
import br.com.smarthouse.corearduino.business.PinoSaidaPWMService;
import br.com.smarthouse.corearduino.business.exception.PortaNaoEncontradaNegocioRuntimeException;
import br.com.smarthouse.corearduino.vo.AcaoRetorno;
import br.com.smarthouse.modelgenerics.vo.LigarDesligar;

@Service
public class PinoSaidaPWMServiceImpl implements PinoSaidaPWMService {

	final static String TIPO_ENTRADA = "PWM";
	
	@Autowired
	private ArduinoJavaService arduinoJavaService;

	@Override
	public AcaoRetorno ligar(final String porta) {
		final AcaoRetorno retorno = verificaSePortaExiste(porta);
		// trata chamada ao Arduino
		try {
			// executa ação no Arduino
			arduinoJavaService.executaAcaoNoArduino(porta, LigarDesligar.LIGAR);
			retorno.setSucesso(true);
		} catch (ConnectException e) {
			retorno.setErro(e.getMessage());
		}
		// retorno
		return retorno;
	}

	@Override
	public AcaoRetorno verificaSePortaExiste(final String porta) {
		// verifica se a porta existe na placa
//		portaExiste(porta);
		// monta objeto de retorno
		final AcaoRetorno retorno = new AcaoRetorno();
		retorno.setSucesso(false);
		// retorno
		return retorno;
	}
	
	private String portaExiste(final String porta) {
		if (porta.equals("7")) {
			return "7";
		}

		throw new PortaNaoEncontradaNegocioRuntimeException(porta, TIPO_ENTRADA);
	}

	@Override
	public AcaoRetorno desligar(final String porta) {
		final AcaoRetorno retorno = verificaSePortaExiste(porta);
		// trata chamada ao Arduino
		try {
			// executa ação no Arduino
			arduinoJavaService.executaAcaoNoArduino(porta, LigarDesligar.DESLIGAR);
			retorno.setSucesso(true);
		} catch (ConnectException e) {
			retorno.setErro(e.getMessage());
		}
		// retorno
		return retorno;
	}

}
