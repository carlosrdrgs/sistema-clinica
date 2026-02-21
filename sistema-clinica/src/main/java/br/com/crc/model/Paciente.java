package br.com.crc.model;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("PACIENTE")
public class Paciente extends Pessoa {
	@OneToMany(mappedBy = "paciente")
	private List<Atendimento> atendimentos;
	@OneToMany
	private List<Plano> planos;
	@ManyToMany
	private List<Doenca> historicoDoencas;
}
