package org.generation.blogPessoal.model;

import java.util.*;
import javax.persistence.Entity;//*indica que essa classe sera uma entidade do jpa
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;//*essa entidade dentro do db vai virar uma tabela
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //*indica que essa classe sera uma entidade do jpa
@Table(name = "TB_POSTAGEM")//*essa entidade dentro do db vai virar uma tabela
public class Postagem {
	
	@Id                                                 //
	@GeneratedValue(strategy = GenerationType.IDENTITY)//esse atributo ira virar uma primary key
	private long id;                                    //
	
	
	@NotNull //indico aqui que ao db que não reberei titulo em branco
	@Size(min = 5,max = 100)
	private String titulo;
	
	@NotNull //indico aqui que ao db que não reberei texto em branco
	@Size(min = 10,max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //indico que estou trabalhando com tempo
	private Date data = new java.sql.Date(System.currentTimeMillis()); //* Assim que entrar um dado nessa classe, ele já captura a data,hora,segundo e milesimo que o dado entrou na classe
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	

}
