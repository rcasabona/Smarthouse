package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import br.com.smarthouse.modelgenerics.Ambiente;

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
	
	@JoinColumn(name = "ID_AMBIENTE")
	private Ambiente ambiente;

=======
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
	
>>>>>>> a568a6a14430dcd923bdfbc174d8d946308a1d57
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

<<<<<<< HEAD
	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
=======
	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
>>>>>>> a568a6a14430dcd923bdfbc174d8d946308a1d57
		this.ambiente = ambiente;
	}

}
