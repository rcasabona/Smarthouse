package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	@Column(name = "TIPO_AMBIENTE", length = 30)
	private TipoAmbiente tipoAmbiente;
	
	@ManyToOne
	@JoinColumn(name = "ID_AMBIENTE")
	private Ambiente ambiente;

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

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

}
