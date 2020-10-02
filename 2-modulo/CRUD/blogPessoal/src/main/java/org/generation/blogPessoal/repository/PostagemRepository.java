package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // anotação que vai indicar ao spring que se trata de um aclasse de repositorio 
public interface PostagemRepository extends JpaRepository<Postagem, Long>{//JpaRepository<T, ID>{ T=o nome da classe dentro de model, id é o tipo id (int,long...)
     
	public List<Postagem> findALLByTituloContainingIgnoreCase (String titulo); //findALLBy = busca todos pelo Titulo = noca so é o nome do atributo na nossa entidade, Containing = vai trazer tudo que estiver dentro do parametro, IgnoreCase = vai ignorar diferença de maiusculo e minusculo
}
