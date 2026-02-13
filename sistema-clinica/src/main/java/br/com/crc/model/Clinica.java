package br.com.crc.model;

import java.time.LocalDate;
import java.util.List;

public class Clinica {
	private Long id;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private List<Contato> contatos;
	private LocalDate dataInclusao;
	private List<Pessoa> funcionarios;

	public Clinica(String cnpj, String razaoSocial, String nomeFantasia, List<Contato> contatos,
			LocalDate dataInclusao, List<Pessoa> funcionarios) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.contatos = contatos;
		this.dataInclusao = dataInclusao;
		this.funcionarios = funcionarios;
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

	public String getContatos() {
		return contatos.toString();
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

	public String getFuncionarios() {
		return funcionarios.toString();
	}

	public void setFuncionarios(List<Pessoa> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia="
				+ nomeFantasia + ", contatos=" + contatos + ", dataInclusao=" + dataInclusao + ", funcionarios="
				+ funcionarios + "]";
	}
}
