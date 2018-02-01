package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controledeluzes.model.ConfiguracoesDeAmbiente;

public interface ConfiguracoesDeAmbienteDAO extends JpaRepository<ConfiguracoesDeAmbiente, Long> {

}
