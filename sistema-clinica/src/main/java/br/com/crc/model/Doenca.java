package br.com.crc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Doenca {
	@Column(name = "doenca_nome")
	private String nome;
	@Column(name = "doenca_cid")
	private String cid;
}
