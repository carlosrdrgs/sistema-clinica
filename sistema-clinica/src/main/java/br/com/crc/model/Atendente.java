package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.experimental.NonFinal;

@Entity
@DiscriminatorValue("ATENDENTE")
public class Atendente extends Pessoa {
	@Column(name = "atendente_email")
	@Email(message = "O formato do e-mail está inválido!")
	private String emailCorporativo;
	@NotNull(message = "O atendente deve trabalhar em pelo menos uma clinica!")
	@Column(name = "atendente_clinicas")
	@OneToMany
	private List<Clinica> clinicas;
	
	public Atendente(String nome, String cpf, LocalDate dataNascimento, String nomeMae, List<Contato> contato,
			Endereco endereco, EstadoCivil estadoCivil, String emailCorporativo, List<Clinica> clinicas) {
		super(nome, cpf, dataNascimento, nomeMae, contato, endereco, estadoCivil);
		this.emailCorporativo = emailCorporativo;
		this.clinicas = clinicas;
	}

	public String getEmailCorporativo() {
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public String getClinicas() {
		return clinicas.toString();
	}

	public void setClinicas(List<Clinica> clinicas) {
		this.clinicas = clinicas;
	}

	@Override
	public String toString() {
		return "Atendente [emailCorporativo=" + emailCorporativo + ", clinicas=" + clinicas + "]";
	}
}
