package br.com.smarthouse.corearduino.vo.pinos;

/**
 * Enum que representa os pinos de saída PWM da placa Arduino Mega 2560
 * total de 12 pinos de saída PWM
 * 
 * @author Rafael Casabona
 *
 */
public enum PinoSaidaPWM {
	
	P2("2"), P3("3"), P4("4"), P5("5"), P6("6"), P7("7"), P8("8"), P9("9"), P10("10"), P11("11"), P12("12"), P13("13");
	
	private PinoSaidaPWM(final String _identificador) {
		this.identificador = _identificador;
	}
	
	private String identificador;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

}
