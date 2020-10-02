package com.secretaria.turma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secretaria.turma.model.Aluno;
import com.secretaria.turma.repository.AlunoRepository;

@RestController // informa para o spring que essa classe se trata de um controlador
@RequestMapping("/aluno") // define qual que a uri que essa classe sera acessada
@CrossOrigin("*") // o front end vem de uma origem diferente, para isso serve essa anotação o *
					// significa que essa classe aceita requisição de qualquer origem

public class AlunoController {

	@Autowired // não é possivel instanciar em uma classe interface então damos esse papel a
				// essa anotação
	private AlunoRepository repository;

	@GetMapping
	public ResponseEntity<List<Aluno>> getALL() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}") // find/get com parametro id
	public ResponseEntity<Aluno> GetById(@PathVariable long id) { // @PathVariable o valor que entrar em Id vai vim vim
																	// como uma variavel do caminho uri
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Aluno> post(@RequestBody Aluno aluno) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}

	@PutMapping
	public ResponseEntity<Aluno> put(@RequestBody Aluno aluno) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

}
