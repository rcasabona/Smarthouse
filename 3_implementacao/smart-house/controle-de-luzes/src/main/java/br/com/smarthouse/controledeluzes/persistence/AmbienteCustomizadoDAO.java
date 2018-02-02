package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controledeluzes.model.ambientecustomizado.AmbienteCustomizado;

public interface AmbienteCustomizadoDAO extends JpaRepository<AmbienteCustomizado, Long> {
	
	

}
