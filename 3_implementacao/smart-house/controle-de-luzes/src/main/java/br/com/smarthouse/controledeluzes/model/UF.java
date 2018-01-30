package br.com.smarthouse.controledeluzes.model;

/**
 * Unidades Federativas do Brasil
 * 
 * @author Rafael Casabona
 *
 */
public enum UF {
	
	BR("Brasil"),
	
	AC("Acre"), AL("Alagoas"), AP("Amapá"), AM("Amazonas"), BA("Bahia"), CE(
			"Ceará"), DF("Distrito Federal"), ES("Espírito Santo"), GO("Goiás"), MA(
			"Maranhão"), MT("Mato Grosso"), MS("Mato Grosso do Sul"), MG(
			"Minas Gerais"), PA("Pará"), PB("Paraíba"), PR("Paraná"), PE(
			"Pernambuco"), PI("Piauí"), RJ("Rio de Janeiro"), RN(
			"Rio Grande do Norte"), RS("Rio Grande do Sul"), RO("Rondônia"), RR(
			"Roraima"), SC("Santa Catarina"), SP("São Paulo"), SE("Sergipe"), TO(
			"Tocantins");

	private String nome;

	private UF(final String nome) {
		this.setNome(nome);
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

}
