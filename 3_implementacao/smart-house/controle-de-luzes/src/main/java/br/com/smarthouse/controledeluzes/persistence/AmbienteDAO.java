package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controledeluzes.model.Ambiente;

public interface AmbienteDAO extends JpaRepository<Ambiente, Long> {

}
