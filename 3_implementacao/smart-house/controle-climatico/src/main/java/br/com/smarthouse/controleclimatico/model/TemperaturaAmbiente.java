package br.com.smarthouse.controleclimatico.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import br.com.smarthouse.modelgenerics.Ambiente;

/**
 * Entity que modela a Temperatura do Ambiente.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "TEMPERATURA_AMBIENTE")
public class TemperaturaAmbiente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4439016722895050607L;

	@Id
	@Column(name = "ID_TEMPERATURA_AMBIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "ID_AMBIENTE")
	private Ambiente ambiente;
	
	@Column(name = "ID_USUARIO")
	private Long identificadorUsuario;
	
	private Date dataUltimaMedicao;
	
	private Double temperatura;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoTemperatura tipoTemperatura;
	
	@Enumerated(EnumType.ORDINAL)
	private QualidadeDoAr qualidadeDoAr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public Long getIdentificadorUsuario() {
		return identificadorUsuario;
	}

	public void setIdentificadorUsuario(Long identificadorUsuario) {
		this.identificadorUsuario = identificadorUsuario;
	}

	public Date getDataUltimaMedicao() {
		return dataUltimaMedicao;
	}

	public void setDataUltimaMedicao(Date dataUltimaMedicao) {
		this.dataUltimaMedicao = dataUltimaMedicao;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public TipoTemperatura getTipoTemperatura() {
		return tipoTemperatura;
	}

	public void setTipoTemperatura(TipoTemperatura tipoTemperatura) {
		this.tipoTemperatura = tipoTemperatura;
	}

	public QualidadeDoAr getQualidadeDoAr() {
		return qualidadeDoAr;
	}

	public void setQualidadeDoAr(QualidadeDoAr qualidadeDoAr) {
		this.qualidadeDoAr = qualidadeDoAr;
	}

}
