package com.secretaria.turma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.secretaria.turma.model.Turma;

@Repository 
   public interface TurmaRepository extends JpaRepository<Turma, Long>{ //JpaRepository<T, ID>{ T=o nome da classe dentro de model, id é o tipo id (int,long...)
	public List<Turma> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}

