package com.farmacia.dez.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // *indica que essa classe sera uma entidade do jpa
@Table(name = "tb_produto") // *essa entidade dentro do db vai virar uma tabela
public class Produto {

	@Id //
	@GeneratedValue(strategy = GenerationType.IDENTITY) // esse atributo ira virar uma primary key
	private long id;

	@NotNull // indico aqui que ao db que não reberei titulo em branco
	@Size(min = 4, max = 50)
	private String nome;

	@NotNull
	private float preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
