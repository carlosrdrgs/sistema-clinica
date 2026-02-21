package br.com.crc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {

}
