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
 * Entity que modela o Ambiente.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "AMBIENTE")
public class Ambiente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 443742651055865482L;

	@Id
	@Column(name = "ID_AMBIENTE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USARIO")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_IMOVEL")
	private Imovel imovel;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_AMBIENTE")
	private TipoAmbiente tipoAmbiente;

	@OneToMany(mappedBy = "ambiente", fetch = FetchType.LAZY)
	private List<Objeto> objeto;



}
