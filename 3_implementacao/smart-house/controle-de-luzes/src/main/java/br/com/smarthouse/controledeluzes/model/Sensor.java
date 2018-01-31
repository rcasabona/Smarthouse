package br.com.smarthouse.controledeluzes.model;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entity que modela o Sensor.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "SENSOR")
public class Sensor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7605693410611065830L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_SENSOR")
	private Long id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_OBJETO")
	private Objeto objeto;
	
	@Enumerated(EnumType.STRING)
	@Column(name =  "TIPO_SENSOR")
	private TipoSensor tipoSensor;
	
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	private Ativo ativo;
	
	@Column(name = "DATA_DA_INSTALACAO")
	private Date dataDaInstalacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoSensor getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(TipoSensor tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Ativo getAtivo() {
		return ativo;
	}

	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}

	public Date getDataDaInstalacao() {
		return dataDaInstalacao;
	}

	public void setDataDaInstalacao(Date dataDaInstalacao) {
		this.dataDaInstalacao = dataDaInstalacao;
	}

}
