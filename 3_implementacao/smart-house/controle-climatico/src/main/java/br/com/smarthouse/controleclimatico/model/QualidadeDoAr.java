package br.com.smarthouse.controleclimatico.model;

public enum QualidadeDoAr {
	
	UMIDO(1), SECO(2), ABAFADO(3);
	
	private QualidadeDoAr(final int qualidade) {
		this.qualidade =  qualidade;
	}
	
	private int qualidade;

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

}
