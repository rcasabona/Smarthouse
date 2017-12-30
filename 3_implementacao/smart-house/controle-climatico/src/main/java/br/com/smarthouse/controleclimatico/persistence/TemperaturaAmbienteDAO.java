package br.com.smarthouse.controleclimatico.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controleclimatico.model.TemperaturaAmbiente;

public interface TemperaturaAmbienteDAO extends JpaRepository<TemperaturaAmbiente, Long> {

}
