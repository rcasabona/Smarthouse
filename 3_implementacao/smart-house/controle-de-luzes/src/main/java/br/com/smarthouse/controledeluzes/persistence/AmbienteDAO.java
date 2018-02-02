package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.smarthouse.controledeluzes.model.ambiente.Ambiente;

public interface AmbienteDAO extends JpaRepository<Ambiente, Long> {
	
	@Query("select a from Ambiente a where a.id = :idAmbiente")
	public Ambiente findByIdAmbiente(@Param("idAmbiente") Long idAmbiente);

}
