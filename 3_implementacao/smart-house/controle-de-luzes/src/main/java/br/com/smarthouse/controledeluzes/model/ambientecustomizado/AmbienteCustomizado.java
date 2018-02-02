package br.com.smarthouse.controledeluzes.model.ambientecustomizado;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AMBIENTE_CUSTOMIZADO")
public class AmbienteCustomizado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AMBIENTE_CUSTOMIZADO")
	private Long id;
	
	@Column(name = "NOME", length = 30)
	private String nome;
	
	@OneToMany(mappedBy = "objeto")
	private List<AmbienteCustomizadoEObjeto> objetos;

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

	public List<AmbienteCustomizadoEObjeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<AmbienteCustomizadoEObjeto> objetos) {
		this.objetos = objetos;
	}

}
