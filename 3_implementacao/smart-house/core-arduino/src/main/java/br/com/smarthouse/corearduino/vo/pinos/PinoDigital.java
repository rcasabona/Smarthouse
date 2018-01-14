package br.com.smarthouse.corearduino.vo.pinos;

/**
 * Enum que representa os pinos digitais da placa Arduino Mega 2560
 * total de 32 pinos digitais
 * 
 * @author Rafael Casabona
 *
 */
public enum PinoDigital {

	P22(22), P23(23), P24(24), P25(25), P26(26), P27(27), P28(28), P29(29), P30(30), P31(31), P32(32), P33(33), P34(
			34), P35(35), P36(36), P37(37), P38(38), P39(39), P40(40), P41(41), P42(42), P43(
					43), P44(44), P45(45), P46(46), P47(47), P48(48), P49(49), P50(50), P51(51), P52(52), P53(53);

	private PinoDigital(final int _identificador) {
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
