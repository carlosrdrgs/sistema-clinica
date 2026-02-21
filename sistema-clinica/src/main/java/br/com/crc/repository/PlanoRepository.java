package br.com.crc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long> {

}
