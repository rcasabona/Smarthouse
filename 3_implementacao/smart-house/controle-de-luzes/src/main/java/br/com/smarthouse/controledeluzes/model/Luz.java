package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Luz implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9001960933781980084L;

	@Id
	private Long id;
	
	@Column
	private String nome;
	
	private String ambiente;
	
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

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

}
