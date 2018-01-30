package br.com.smarthouse.controledeluzes.model;

public enum Ativo {
	
	NAO_ATIVO(0), ATIVO(1);
	
	private Ativo(final int nome) {
		this.nome = nome;
	}
	
	private int nome;

	public int getNome() {
		return nome;
	}

	public void setNome(final int nome) {
		this.nome = nome;
	}

}
