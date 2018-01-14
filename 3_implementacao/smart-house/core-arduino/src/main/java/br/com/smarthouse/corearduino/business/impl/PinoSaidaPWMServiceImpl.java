package br.com.smarthouse.corearduino.business.impl;

import org.springframework.stereotype.Service;

import br.com.smarthouse.corearduino.business.PinoSaidaPWMService;
import br.com.smarthouse.corearduino.business.exception.PortaNaoEncontradaNegocioRuntimeException;

@Service
public class PinoSaidaPWMServiceImpl implements PinoSaidaPWMService {

	final static String TIPO_ENTRADA = "PWM";

	@Override
	public String portaExiste(final String porta) {
		if (porta.equals("7")) {
			return "7";
		}

		throw new PortaNaoEncontradaNegocioRuntimeException(porta, TIPO_ENTRADA);
	}

}
