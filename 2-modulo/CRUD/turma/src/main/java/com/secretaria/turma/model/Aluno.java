package com.secretaria.turma.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //*indica que essa classe sera uma entidade do jpa
@Table(name = "aluno")//*essa entidade dentro do db vai virar uma tabela
public class Aluno {
	
	@Id                                                 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esse atributo ira virar uma primary key
	private long id;
	
	@NotNull //indico aqui que ao db que não reberei turma em branco
	@Size(min = 1)
	private String nome;
	
	@NotNull
	private boolean matricula;

	@ManyToOne
	@JsonIgnoreProperties("aluno")
	private Turma turma;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	
	
	
	

}
