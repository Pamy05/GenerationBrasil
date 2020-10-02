package com.farmacia.dez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.dez.model.Categoria;

@Repository // anotação que vai indicar ao spring que se trata de um aclasse de repositorio
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{ //JpaRepository<T, ID>{ T=o nome da classe dentro de model, id é o tipo id (int,long...)
	public List<Categoria> findALLByDescricaoContainingIgnoreCase(String descricao); // findALLByDescricaoContainingIgnoreCase
																						// = só um nome que importa a
																						// model
}
