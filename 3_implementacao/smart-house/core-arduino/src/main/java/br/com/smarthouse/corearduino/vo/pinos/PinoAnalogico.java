package br.com.smarthouse.corearduino.vo.pinos;

/**
 * Enum que representa os pinos analógicos da placa Arduino Mega 2560
 * total de 16 pinos analógicos
 * 
 * @author Rafael Casabona
 *
 */
public enum PinoAnalogico {

	A0("A0"), A1("A1"), A2("A2"), A3("A3"), A4("A4"), A5("A5"), A6("A6"), A7("A7"), A8("A8"), A9("A9"), A10("A10"), A11(
			"A11"), A12("A12"), A13("A13"), A14("A14"), A15("A15");

	private PinoAnalogico(final String _identificador) {
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
