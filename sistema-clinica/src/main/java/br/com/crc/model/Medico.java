package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@DiscriminatorValue("MEDICO")
public class Medico extends Pessoa {
	@Column(name = "medico_crm")
	@NotBlank(message = "O campo de CRM não pode estar vazio!")
	private String crm;
	
	@Column(name = "medico_especialidade")
	@NotBlank(message = "O campo de especialidade não pode estar vazio!")
	private String especialidade;

	@Email(message = "O formato do e-mail está inválido!")
	@Column(name = "medico_email")
	private String emailCorporativo;
	
	public Medico() {
	}

	public Medico(String nome, String cpf, LocalDate dataNascimento, String nomeMae, List<Contato> contato,
			Endereco endereco, EstadoCivil estadoCivil, String crm, String especialidade, String emailCorporativo) {
		super(nome, cpf, dataNascimento, nomeMae, contato, endereco, estadoCivil);
		this.crm = crm;
		this.especialidade = especialidade;
		this.emailCorporativo = emailCorporativo;
	}

	public String getEmailCorporativo() {
		return emailCorporativo;
	}

	public void setEmailCorporativo(String emailCorporativo) {
		this.emailCorporativo = emailCorporativo;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", especialidade=" + especialidade + "]";
	}
}
