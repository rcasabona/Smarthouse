package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity que modela o Ambiente.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "AMBIENTE")
public class Ambiente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 443742651055865482L;

	@Id
	@Column(name = "ID_AMBIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_AMBIENTE")
	private TipoAmbiente tipoAmbiente;

	@Column(name = "DESCRICAO")
	private String descricao;
	
	@OneToMany(mappedBy = "ambiente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<SubAmbiente> subAmbientes = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoAmbiente getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(TipoAmbiente tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<SubAmbiente> getSubAmbientes() {
		return subAmbientes;
	}

	public void setSubAmbientes(List<SubAmbiente> subAmbientes) {
		this.subAmbientes = subAmbientes;
	}

}
