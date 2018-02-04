package br.com.smarthouse.controledeluzes.model.ambientecustomizado;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.smarthouse.controledeluzes.model.Ligado;
import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;

@Entity
@Table(name = "SET_LUZES_OBJETO")
public class SetLuzesObjeto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5191288674695674336L;

	@EmbeddedId
	private SetLuzesObjetoId id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_objeto", insertable = false, updatable = false)
	private Objeto objeto;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_set_luzes", insertable = false, updatable = false)
	private SetLuzes setLuzes;
	
	@Column(name = "LIGADO")
	@Enumerated(EnumType.STRING)
	private Ligado ligado;
	
	public SetLuzesObjeto(){}
	
	public SetLuzesObjeto(final Objeto _objeto, final SetLuzes _setLuzes, final Ligado _ligado) {
		// create primary key
		this.id = new SetLuzesObjetoId(_objeto.getId(), _setLuzes.getId());
		
		// initialize attributes
		this.objeto = _objeto;
		this.setLuzes = _setLuzes;
		this.ligado = _ligado;
		
		// update relationships to assure referential integrity
		_setLuzes.getObjetos().add(this);
		_objeto.getSetLuzes().add(this);
	}

	public SetLuzesObjetoId getId() {
		return id;
	}

	public void setId(SetLuzesObjetoId id) {
		this.id = id;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public SetLuzes getSetLuzes() {
		return setLuzes;
	}

	public void setSetLuzes(SetLuzes setLuzes) {
		this.setLuzes = setLuzes;
	}

	public Ligado getLigado() {
		return ligado;
	}

	public void setLigado(Ligado ligado) {
		this.ligado = ligado;
	}

	public static class SetLuzesObjetoId implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -3532334266492027680L;

		@Column(name = "id_objeto")
		protected Long idObjeto;

		@Column(name = "id_set_luzes")
		protected Long idSetLuzes;

		public SetLuzesObjetoId() {
		}

		public SetLuzesObjetoId(final Long _idObjeto, final Long _idSetLuzes) {
			this.idObjeto = _idObjeto;
			this.idSetLuzes = _idSetLuzes;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((idObjeto == null) ? 0 : idObjeto.hashCode());
			result = prime * result + ((idSetLuzes == null) ? 0 : idSetLuzes.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;

			SetLuzesObjetoId other = (SetLuzesObjetoId) obj;

			if (idObjeto == null) {
				if (other.idObjeto != null)
					return false;
			} else if (!idObjeto.equals(other.idObjeto))
				return false;

			if (idSetLuzes == null) {
				if (other.idSetLuzes != null)
					return false;
			} else if (!idSetLuzes.equals(other.idSetLuzes))
				return false;

			return true;
		}

		public Long getIdObjeto() {
			return idObjeto;
		}

		public void setIdObjeto(Long idObjeto) {
			this.idObjeto = idObjeto;
		}

		public Long getIdSetLuzes() {
			return idSetLuzes;
		}

		public void setIdSetLuzes(Long idSetLuzes) {
			this.idSetLuzes = idSetLuzes;
		}

	}

}
