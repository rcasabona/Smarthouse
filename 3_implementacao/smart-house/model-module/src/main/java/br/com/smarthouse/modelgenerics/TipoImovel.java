package br.com.smarthouse.modelgenerics;

public enum TipoImovel {

	CASA_TERREA("Casa Térrea"), SOBRADO("Sobrado"), APARTAMENTO("Apartamento"), MANSAO("Mansão"), DUPLEX(
			"Duplex"), TRIPLEX("Triplex"), SALA_COMERCIAL("Sala Comercial"), EDIFICIO_COMERCIAL(
					"Edifício Comercial"), EDIFICIO_RESIDENCIAL("Edifícil Residencial");

	private String nome;

	private TipoImovel(final String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

}
