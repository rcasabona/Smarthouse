package br.com.smarthouse.controledeluzes.model.ambiente;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

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

import br.com.smarthouse.controledeluzes.model.Ligado;
import br.com.smarthouse.controledeluzes.model.Componente;
import br.com.smarthouse.controledeluzes.model.TipoObjeto;
import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzesObjeto;

/**
 * Entity que modela o Objeto.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "OBJETO")
public class Objeto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5637998585004399420L;

	@Id
	@Column(name = "ID_OBJETO", updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NOME", length = 80, nullable = false)
	private String nome;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUBAMBIENTE")
	private SubAmbiente subAmbiente;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_OBJETO", length = 20, nullable = false)
	private TipoObjeto tipoObjeto;

	@Enumerated(EnumType.STRING)
	@Column(name = "LIGADO", length = 3, nullable = false)
	private Ligado ligado;

	@OneToMany(mappedBy = "objeto", fetch = FetchType.LAZY)
	private List<Componente> componente;

	@JsonIgnore
	@OneToMany(mappedBy = "objeto")
    private Set<SetLuzesObjeto> setLuzes = new HashSet<SetLuzesObjeto>();

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

	public SubAmbiente getSubAmbiente() {
		return subAmbiente;
	}

	public void setSubAmbiente(SubAmbiente subAmbiente) {
		this.subAmbiente = subAmbiente;
	}

	public TipoObjeto getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(TipoObjeto tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

	public Ligado getLigado() {
		return ligado;
	}

	public void setLigado(Ligado ligado) {
		this.ligado = ligado;
	}

	public List<Componente> getComponente() {
		return componente;
	}

	public void setComponente(List<Componente> componente) {
		this.componente = componente;
	}

	public Set<SetLuzesObjeto> getSetLuzes() {
		return setLuzes;
	}

	public void setSetLuzes(Set<SetLuzesObjeto> setLuzes) {
		this.setLuzes = setLuzes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Objeto objeto = (Objeto) o;
		return Objects.equals(nome, objeto.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

}
