package br.com.smarthouse.modelgenerics;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity que modela o Endereço.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "ENDERECO")
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4051953403861884452L;
	
	@Id
	@Column(name = "ID_ENDERECO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ID_USUARIO")
	private Long identificadorUsuario;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	/**
	 * UF e Cidade do Endereço.
	 */
	@ManyToOne
	@JoinColumn(name = "ID_CIDADE", insertable = false, updatable = false)
	private Cidade cidade;
	
	@Column(length = 8)
	private String cep;
	
	private String pais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdentificadorUsuario() {
		return identificadorUsuario;
	}

	public void setIdentificadorUsuario(Long identificadorUsuario) {
		this.identificadorUsuario = identificadorUsuario;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
