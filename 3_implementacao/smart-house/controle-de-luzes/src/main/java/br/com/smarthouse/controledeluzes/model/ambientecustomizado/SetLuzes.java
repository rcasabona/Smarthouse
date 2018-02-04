package br.com.smarthouse.controledeluzes.model.ambientecustomizado;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SET_LUZES")
public class SetLuzes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 484214266542895779L;

	@Id
	@Column(name = "ID_SET_LUZES", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@OneToMany(mappedBy = "setLuzes")
    private Set<SetLuzesObjeto> objetos = new HashSet<SetLuzesObjeto>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<SetLuzesObjeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(Set<SetLuzesObjeto> objetos) {
		this.objetos = objetos;
	}

}
