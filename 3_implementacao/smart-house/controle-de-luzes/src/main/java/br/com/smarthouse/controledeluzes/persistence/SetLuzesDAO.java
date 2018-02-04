package br.com.smarthouse.controledeluzes.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smarthouse.controledeluzes.model.ambientecustomizado.SetLuzes;

public interface SetLuzesDAO extends JpaRepository<SetLuzes, Long> {

}
