package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

public class Pessoa {
	private Long id;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String nomeMae;
	private List<Contato> contato;
	private Endereco endereco;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, String cpf, LocalDate dataNascimento, String nomeMae, List<Contato> contato,
			Endereco endereco, EstadoCivil estadoCivil) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nomeMae = nomeMae;
		this.contato = contato;
		this.endereco = endereco;
		this.estadoCivil = estadoCivil;
	}

	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getContato() {
		return contato.toString();
	}

	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae
				+ ", contato=" + contato + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	
}
