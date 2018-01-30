package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity que modela as luzes.
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "LUZ")
public class Luz implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4222034581783822551L;
	
	@Id
	@Column(name = "ID_LUZ")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "PORTA")
	private int porta;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUBAMBIENTE")
	private SubAmbiente subAmbiente;

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

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	public SubAmbiente getSubAmbiente() {
		return subAmbiente;
	}

	public void setSubAmbiente(SubAmbiente subAmbiente) {
		this.subAmbiente = subAmbiente;
	}

}
