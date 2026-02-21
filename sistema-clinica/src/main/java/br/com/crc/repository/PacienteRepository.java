package br.com.crc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
