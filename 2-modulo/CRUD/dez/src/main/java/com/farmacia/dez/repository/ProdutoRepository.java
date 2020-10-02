package com.farmacia.dez.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.dez.model.Produto;

@Repository // anotação que vai indicar ao spring que se trata de um aclasse de repositorio
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findALLByNomeContainingIgnoreCase(String nome); // findALLByDescricaoContainingIgnoreCase = só
																			// um nome que importa a model
}
