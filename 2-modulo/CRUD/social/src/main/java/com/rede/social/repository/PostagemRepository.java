package com.rede.social.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rede.social.model.Postagem;
import com.rede.social.model.Tema;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
