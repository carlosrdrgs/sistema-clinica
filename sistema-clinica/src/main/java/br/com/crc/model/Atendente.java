package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

public class Atendente extends Pessoa {
	private String emailCorporativo;
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
