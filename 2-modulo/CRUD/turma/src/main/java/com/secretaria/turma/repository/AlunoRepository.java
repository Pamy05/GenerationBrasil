package com.secretaria.turma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secretaria.turma.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> { // JpaRepository<T, ID>{ T=o nome da classe dentro
																		// de model, id é o tipo id (int,long...)
	public List<Aluno> findAllByNomeContainingIgnoreCase(String nome); // o find Nome tem que ser igual os modificadores

}
