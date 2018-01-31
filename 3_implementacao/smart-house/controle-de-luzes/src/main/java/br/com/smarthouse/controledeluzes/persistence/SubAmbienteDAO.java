package br.com.smarthouse.controledeluzes.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.smarthouse.controledeluzes.model.SubAmbiente;

public interface SubAmbienteDAO extends JpaRepository<SubAmbiente, Long> {
	
	@Query("select s from SubAmbiente s where s.ambiente.id = :idAmbiente")
	public List<SubAmbiente> findByIdAmbiente(@Param("idAmbiente") Long idAmbiente);

}
