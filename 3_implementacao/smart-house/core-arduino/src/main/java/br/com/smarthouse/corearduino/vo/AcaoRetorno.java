package br.com.smarthouse.corearduino.vo;

public class AcaoRetorno {
	
	private boolean sucesso;
	private String erro;
	
	public boolean isSucesso() {
		return sucesso;
	}
	public void setSucesso(boolean sucesso) {
		this.sucesso = sucesso;
	}
	public String getErro() {
		return erro;
	}
	public void setErro(String erro) {
		this.erro = erro;
	}

}
