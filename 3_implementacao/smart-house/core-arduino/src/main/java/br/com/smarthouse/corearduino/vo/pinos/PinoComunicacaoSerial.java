package br.com.smarthouse.corearduino.vo.pinos;

/**
 * Enum que representa os pinos de comunicação serial da placa Arduino Mega 2560
 * total de 8 pinos de comunicação serial
 * 
 * @author Rafael Casabona
 *
 */
public enum PinoComunicacaoSerial {

	TX0_1(1), RX0_0(0), TX3_14(14), RX3_15(15), TX2_16(16), RX2_17(17), TX1_18(18), RX1_19(19);

	private PinoComunicacaoSerial(final int _identificador) {
		this.identificador = _identificador;
	}

	private int identificador;

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

}
