package br.com.crc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "O número de telefone não pode estar em branco!")
	private String numero;
	
	@Email(message = "O formato do e-mail está inválido!")
	@NotBlank(message = "O e-mail não pode estar em branco!")
	private String email;

	public Contato() {
	}

	public Contato(String numero, String email) {
		this.numero = numero;
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", numero=" + numero + ", email=" + email + "]";
	}
}