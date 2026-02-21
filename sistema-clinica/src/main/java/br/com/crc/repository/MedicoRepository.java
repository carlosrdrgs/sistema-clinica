package br.com.crc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
	Optional<Medico> findByCrm(String Crm);
	Boolean existsByCpf(String cpf);
}
