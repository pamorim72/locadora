package br.com.locadora.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "sequence", sequenceName = "dvd_sequence", allocationSize = 1)
public class DVD {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
	private Long id;

	private String nome;

	private boolean alugado;

	@Temporal(TemporalType.DATE)
	private Date alugadoEm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public Date getAlugadoEm() {
		return alugadoEm;
	}

	public void setAlugadoEm(Date alugadoEm) {
		this.alugadoEm = alugadoEm;
	}
}