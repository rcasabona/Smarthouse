package br.com.smarthouse.controledeluzes.model.ambientecustomizado;

import java.io.Serializable;

public class AmbienteCustomizadoEObjetoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9103335638025742263L;

	private Long idAmbienteCustomizado;

	private Long idObjeto;

	@Override
	public int hashCode() {
		return (int) (idAmbienteCustomizado + idObjeto);
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof AmbienteCustomizadoEObjetoId) {
			AmbienteCustomizadoEObjetoId otherId = (AmbienteCustomizadoEObjetoId) object;
			return (otherId.idAmbienteCustomizado == this.idAmbienteCustomizado) && (otherId.idObjeto == this.idObjeto);
		}
		return false;
	}

}
