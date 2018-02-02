package br.com.smarthouse.controledeluzes.model.ambiente;

import java.io.Serializable;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.smarthouse.controledeluzes.model.TipoAmbiente;

/**
 * Entity que modela o Sub Ambiente
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "SUB_AMBIENTE")
public class SubAmbiente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7952621692447590860L;

	@Id
	@Column(name = "ID_SUBAMBIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_AMBIENTE", length = 30, nullable = false)
	private TipoAmbiente tipoAmbiente;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AMBIENTE")
	private Ambiente ambiente;
	
	@OneToMany(mappedBy = "subAmbiente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Objeto> objetos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoAmbiente getTipoAmbiente() {
		return tipoAmbiente;
	}
	
	public String getTipoAmbienteStr() {
		return tipoAmbiente.getNome();
	} 

	public void setTipoAmbiente(TipoAmbiente tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public List<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Objeto> objetos) {
		this.objetos = objetos;
	}

}
