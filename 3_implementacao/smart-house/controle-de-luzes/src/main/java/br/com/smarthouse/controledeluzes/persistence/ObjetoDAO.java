package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controledeluzes.model.ambiente.Objeto;

public interface ObjetoDAO extends JpaRepository<Objeto, Long> {

}
