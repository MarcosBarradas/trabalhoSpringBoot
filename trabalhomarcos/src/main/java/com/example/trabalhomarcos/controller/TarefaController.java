package com.example.trabalhomarcos.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trabalhomarcos.model.Tarefa;
import com.example.trabalhomarcos.repository.TarefaRepository;

@RestController
@RequestMapping({ "/tarefas" })
public class TarefaController {
	private TarefaRepository repository;

	TarefaController(TarefaRepository tarefaRepository) {
		this.repository = tarefaRepository;
	}

	@GetMapping
	public List<?> findAll() {
		return repository.findAll();
	}
	
	//4581796 - marcos vinicius de moraes barradas - barueri/SP
	
	@GetMapping(path = { "/{id}" })
	public ResponseEntity<?> findById(@PathVariable long id) {
		return repository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public Tarefa create(@RequestBody Tarefa tarefa) {
		return repository.save(tarefa);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(
			@PathVariable("id") long id,
			@RequestBody Tarefa tarefa
			) {
		return repository.findById(id)
				.map(record -> {
			record.setResponsavel(tarefa.getResponsavel());
			record.setTarefa(tarefa.getTarefa());
			record.setData(tarefa.getData());
			Tarefa updated = repository.save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable long id) {
		return repository.findById(id).map(record -> {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}