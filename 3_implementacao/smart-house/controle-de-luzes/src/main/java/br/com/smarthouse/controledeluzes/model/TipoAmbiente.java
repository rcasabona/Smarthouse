package br.com.smarthouse.controledeluzes.model;

public enum TipoAmbiente {

	// Sala
	SALA("Sala"), SALA_DE_ESTAR("Sala de Estar"), SALA_DE_JANTAR("Sala de Jantar"), SALA_DE_REUNIAO("Sala de Reunião"),
	// Quarto
	QUARTO("Quarto"), SUITE("Suíte"),
	// Banheiro
	BANHEIRO("Banheiro"),
	// Escritório
	ESCRITORIO("Escritório"),
	// Cozinha
	COZINHA("Cozinha"), AREA_GOURMET("Área Gourmet"), DISPENSA("Dispensa"),
	// Lavanderia
	LAVANDERIA("Lavanderia"), 
	// Garagem
	GARAGEM("Garagem"), HALL("Hall"), 
	// Lazer
	SOLARIUM("Solarium"), HORTA("Horta"), JARDIM("Jardim"), AREA_DE_PISCINA("Área de Piscina");

	private TipoAmbiente(final String nome) {
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
