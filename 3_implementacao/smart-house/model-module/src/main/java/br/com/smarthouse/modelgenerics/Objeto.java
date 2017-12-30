package br.com.smarthouse.modelgenerics;

import java.io.Serializable;
import java.util.List;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_OBJETO")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AMBIENTE")
	private Ambiente ambiente;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_OBJETO")
	private TipoObjeto tipoObjeto;

	@Enumerated(EnumType.STRING)
	@Column(name = "LIGADO")
	private Ligado ligado;

	@OneToMany(mappedBy = "objeto", fetch = FetchType.LAZY)
	private List<Sensor> sensor;

}
