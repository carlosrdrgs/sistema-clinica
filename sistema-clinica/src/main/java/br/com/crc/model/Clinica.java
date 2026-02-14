package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.br.CNPJ;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Clinica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CNPJ(message = "O CNPJ está em um formato inválido!")
	@NotBlank(message = "O CNPJ não pode estar em branco!")
	private String cnpj;
	
	@NotBlank(message = "A Razão Social não pode estar em branco!")
	private String razaoSocial;
	
	@NotBlank(message = "O Nome Fantasia não pode estar em branco!")
	private String nomeFantasia;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contato> contatos;
	
	private LocalDate dataInclusao;
	
	@OneToMany
	private List<Pessoa> funcionarios;
	
	@OneToOne
	private Endereco endereco;

	public Clinica(String cnpj, String razaoSocial, String nomeFantasia, List<Contato> contatos,
			LocalDate dataInclusao, List<Pessoa> funcionarios, Endereco endereco) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.contatos = contatos;
		this.dataInclusao = dataInclusao;
		this.funcionarios = funcionarios;
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public void setFuncionarios(List<Pessoa> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public List<Pessoa> getFuncionarios() {
		return funcionarios;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia="
				+ nomeFantasia + ", contatos=" + contatos + ", dataInclusao=" + dataInclusao + ", funcionarios="
				+ funcionarios + "]";
	}
}
