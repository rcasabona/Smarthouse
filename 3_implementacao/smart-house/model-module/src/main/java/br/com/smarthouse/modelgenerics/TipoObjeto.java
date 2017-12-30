package br.com.smarthouse.modelgenerics;

public enum TipoObjeto {

	LUSTRE("Lustre"), BANHEIRA("Banheira"), CHUVEIRO("Chuveiro"), LAMPADA("Lâmpada"), SOM("Som"), TELEVISAO(
			"Televisão"), PLANTA("Planta"), PISCINA("Piscina");

	private TipoObjeto(final String nome) {
		this.nome = nome;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
