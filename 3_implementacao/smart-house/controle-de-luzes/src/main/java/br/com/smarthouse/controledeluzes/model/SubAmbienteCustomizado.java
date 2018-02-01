package br.com.smarthouse.controledeluzes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "SUB_AMBIENTE_CUSTOMIZADO")
public class SubAmbienteCustomizado {
	
	@Id
	@Column(name = "ID_SUB_AMBIENTE_CUSTOMIZADO")
	private Long id;
	
	@Column(name = "NOME", length = 20)
	private String nome;

	@JoinColumn(name = "ID_SUBAMBIENTE")
	private Long idSubAmbiente;

	@JoinColumn(name = "ID_OBJETO")
	private Long idObjeto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdSubAmbiente() {
		return idSubAmbiente;
	}

	public void setIdSubAmbiente(Long idSubAmbiente) {
		this.idSubAmbiente = idSubAmbiente;
	}

	public Long getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(Long idObjeto) {
		this.idObjeto = idObjeto;
	}

}
