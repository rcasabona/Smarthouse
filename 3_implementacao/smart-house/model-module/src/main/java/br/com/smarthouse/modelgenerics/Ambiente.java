package br.com.smarthouse.modelgenerics;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USARIO")
	private Usuario usuario;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_AMBIENTE")
	private TipoAmbiente tipoAmbiente;

	@OneToMany(mappedBy = "ambiente", fetch = FetchType.LAZY)
	private List<Objeto> objeto;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUBAMBIENTE")
	private List<SubAmbiente> subAmbientes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoAmbiente getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(TipoAmbiente tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public List<Objeto> getObjeto() {
		return objeto;
	}

	public void setObjeto(List<Objeto> objeto) {
		this.objeto = objeto;
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
