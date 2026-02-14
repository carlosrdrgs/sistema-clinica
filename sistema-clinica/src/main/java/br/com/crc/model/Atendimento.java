package br.com.crc.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Atendimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@Column(name = "atendimento_paciente")
	private Paciente paciente;
	
	@OneToOne
	@Column(name = "atendimento_medico")
	private Medico medico;
	
	@OneToOne
	@Column(name = "atendimento_clinica")
	private Clinica clinica;
	
	@OneToOne
	@Column(name = "atendimento_data")
	private LocalDate dataDoAtendimento;
	
	@OneToMany
	private Doenca doencas;
	
	@Column(name = "atendimento_diagnostico")
	private Boolean diagnostico;
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	public LocalDate getDataDoAtendimento() {
		return dataDoAtendimento;
	}
	public void setDataDoAtendimento(LocalDate dataDoAtendimento) {
		this.dataDoAtendimento = dataDoAtendimento;
	}
	public Doenca getDoencas() {
		return doencas;
	}
	public void setDoencas(Doenca doencas) {
		this.doencas = doencas;
	}
	public Boolean getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(Boolean diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Atendimento [id=" + id + ", paciente=" + paciente + ", medico=" + medico + ", clinica=" + clinica
				+ ", dataDoAtendimento=" + dataDoAtendimento + ", doencas=" + doencas + ", diagnostico=" + diagnostico
				+ "]";
	}
}
