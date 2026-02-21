package br.com.crc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.crc.model.Doenca;

public interface DoencaRepository extends JpaRepository<Doenca, Long> {

}
