package br.com.smarthouse.controledeluzes.vo;

public class StatusObjetoVO {
	
	private LigarDesligar estado;
	private int pino;
	
	public LigarDesligar getEstado() {
		return estado;
	}
	public void setEstado(LigarDesligar estado) {
		this.estado = estado;
	}
	public int getPino() {
		return pino;
	}
	public void setPino(int pino) {
		this.pino = pino;
	}

}
