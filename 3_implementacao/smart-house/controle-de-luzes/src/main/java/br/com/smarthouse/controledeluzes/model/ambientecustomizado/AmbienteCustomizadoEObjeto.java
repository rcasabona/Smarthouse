package br.com.smarthouse.controledeluzes.model.ambientecustomizado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;

@Entity
@Table(name = "AMBIENTE_CUSTOMIZADO_OBJETO")
@IdClass(AmbienteCustomizadoEObjetoId.class)
public class AmbienteCustomizadoEObjeto {

	@Id
	@Column(name = "ID_AMBIENTE_CUSTOMIZADO")
	private Long idAmbienteCustomizado;

	@Id
	@Column(name = "ID_OBJETO")
	private Long idObjeto;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "ID_AMBIENTE_CUSTOMIZADO", referencedColumnName = "ID_AMBIENTE_CUSTOMIZADO")
	private AmbienteCustomizado ambienteCustomizado;

	@ManyToOne
	@PrimaryKeyJoinColumn(name = "ID_OBJETO", referencedColumnName = "ID_OBJETO")
	private Objeto objeto;

	public Long getIdAmbienteCustomizado() {
		return idAmbienteCustomizado;
	}

	public void setIdAmbienteCustomizado(Long idAmbienteCustomizado) {
		this.idAmbienteCustomizado = idAmbienteCustomizado;
	}

	public Long getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(Long idObjeto) {
		this.idObjeto = idObjeto;
	}

	public AmbienteCustomizado getAmbienteCustomizado() {
		return ambienteCustomizado;
	}

	public void setAmbienteCustomizado(AmbienteCustomizado ambienteCustomizado) {
		this.ambienteCustomizado = ambienteCustomizado;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

}
