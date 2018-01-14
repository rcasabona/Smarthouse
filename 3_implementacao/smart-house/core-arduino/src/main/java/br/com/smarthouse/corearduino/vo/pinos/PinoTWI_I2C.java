package br.com.smarthouse.corearduino.vo.pinos;

/**
 * Enum que representa os pinos TWI(I2C) da placa Arduino Mega 2560
 * total de 2 pinos TWI(I2C)
 * 
 * @author Rafael Casabona
 *
 */
public enum PinoTWI_I2C {
	
	P20(20), P21(21);
	
	private PinoTWI_I2C(final int _identificador) {
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
