package br.com.smarthouse.controledeluzes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity que modela as Configurações de Ambiente.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "CONFIGURACAOES_DE_AMBIENTE")
public class ConfiguracoesDeAmbiente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "ID_CONFIGURACOES_DE_AMBIENTE")
	private Long id;
	
//	@Column(name = "NOME", length = 20, nullable = false)
//	private String nome;
//
//	@OneToMany(mappedBy = "ambiente", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//	private List<Ambiente> ambientes;
//
//	@JoinColumn(name = "ID_USUARIO")
//	private Usuario usuarioDeCriacao;
//
//	@JoinColumn(name = "ID_USUARIO")
//	private Usuario usuarioDeAlteracao;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public List<Ambiente> getAmbientes() {
//		return ambientes;
//	}
//
//	public void setAmbientes(List<Ambiente> ambientes) {
//		this.ambientes = ambientes;
//	}
//
//	public Usuario getUsuarioDeCriacao() {
//		return usuarioDeCriacao;
//	}
//
//	public void setUsuarioDeCriacao(Usuario usuarioDeCriacao) {
//		this.usuarioDeCriacao = usuarioDeCriacao;
//	}
//
//	public Usuario getUsuarioDeAlteracao() {
//		return usuarioDeAlteracao;
//	}
//
//	public void setUsuarioDeAlteracao(Usuario usuarioDeAlteracao) {
//		this.usuarioDeAlteracao = usuarioDeAlteracao;
//	}

}
