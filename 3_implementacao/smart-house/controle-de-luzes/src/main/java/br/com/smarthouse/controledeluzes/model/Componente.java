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

import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;

/**
 * Entity que modela o Componente.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "COMPONENTE")
public class Componente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7605693410611065830L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_COMPONENTE")
	private Long id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_OBJETO")
	private Objeto objeto;
	
	@Enumerated(EnumType.STRING)
	@Column(name =  "TIPO_COMPONENTE")
	private TipoComponente tipoComponente;
	
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	private Ativo ativo;
	
	@Column(name = "DATA_DA_INSTALACAO")
	private Date dataDaInstalacao;
	
	@Column(name = "PORTA")
	private String porta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public TipoComponente getTipoComponente() {
		return tipoComponente;
	}

	public void setTipoComponente(TipoComponente tipoComponente) {
		this.tipoComponente = tipoComponente;
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

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

}
