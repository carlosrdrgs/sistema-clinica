package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome não pode ser vazio!")
	@Column(name = "nome_completo")
	private String nome;

	@CPF(message = "O CPF está em um formato inválido!")
	@NotBlank(message = "O CPF não pode ser vazio!")
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	@NotNull(message = "A data de nascimento não pode estar vazia!")
	@Past(message = "Data de nascimento não pode ser no futuro!")
	private LocalDate dataNascimento;
	private String nomeMae;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contato> contato;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estado_civil")
	private EstadoCivil estadoCivil;

	
	public Pessoa() {
	}

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

	public List<Contato> getContato() {
		return contato;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", nomeMae=" + nomeMae
				+ ", contato=" + contato + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	
}
