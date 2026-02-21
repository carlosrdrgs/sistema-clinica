package br.com.crc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica, Long> {

}
