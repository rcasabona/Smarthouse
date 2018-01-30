package br.com.smarthouse.controledeluzes.model;

public enum TipoAmbiente {

	SALA("Sala"), SALA_DE_ESTAR("Sala de Estar"), QUARTO("Quarto"), BANHEIRO("Banheiro"), ESCRITORIO(
			"Escritório"), COZINHA("Cozinha"), LAVANDERIA("Lavanderia"), GARAGEM("Garagem"), Dispensa("Dispensa"), HALL(
					"Hall"), AREA_GOURMET("Área Gourmet"), SOLARIUM("Solarium"), HORTA(
							"Horta"), JARDIM("Jardim"), AREA_DE_PISCINA(
									"Área de Piscina"), SUITE("Suíte"), SALA_DE_REUNIAO("Sala de Reunião");

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
