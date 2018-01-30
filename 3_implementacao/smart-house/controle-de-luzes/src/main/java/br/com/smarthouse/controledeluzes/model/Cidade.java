package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CIDADE")
public class Cidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2379793765791209541L;

	@Id
	@Column(name = "ID_CIDADE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	/**
	 * Unidade Federativa a qual pertence a Cidade.
	 */
	@Enumerated(EnumType.STRING)
	private UF uf;

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

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

}
