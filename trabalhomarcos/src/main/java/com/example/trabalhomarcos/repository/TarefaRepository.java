package com.example.trabalhomarcos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalhomarcos.model.Tarefa;

@Repository
public interface TarefaRepository  extends JpaRepository <Tarefa, Long>{

}
