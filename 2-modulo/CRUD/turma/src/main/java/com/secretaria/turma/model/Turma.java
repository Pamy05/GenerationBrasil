package com.secretaria.turma.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //*indica que essa classe sera uma entidade do jpa
@Table(name = "turma")//*essa entidade dentro do db vai virar uma tabela
public class Turma {
	
	@Id                                                 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esse atributo ira virar uma primary key
	private long id;
	
	@NotNull //indico aqui que ao db que não reberei turma em branco
	@Size(min = 1)
	private String descricao;
	
	@NotNull
	private boolean ativo;

	@OneToMany(mappedBy = "turma", cascade = CascadeType.ALL)
	 @JsonIgnoreProperties ("turma")
	private List<Aluno> aluno;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

    
	
	
	

}
