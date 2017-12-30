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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity que modela o Imóvel.
 * 
 * @author Rafael Casabona
 *
 */
@Entity
@Table(name = "IMOVEL")
public class Imovel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2133883970512755249L;
	
	@Id
	@Column(name = "ID_IMOVEL")
	@SequenceGenerator(name = "SQ_IMOVEL", sequenceName = "SQ_IMOVEL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_IMOVEL")
	private Long id;

	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_IMOVEL")
	private TipoImovel tipoImovel;
	
	@OneToMany(mappedBy="imovel", fetch=FetchType.LAZY)
	private List<Ambiente> ambiente;
	
}
