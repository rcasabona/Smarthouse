package br.com.smarthouse.controledeluzes.model;

import java.util.List;

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
	
	private List<SubAmbiente> subAmbientes;

}
