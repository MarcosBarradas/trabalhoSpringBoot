package com.example.trabalhomarcos.model;

import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String responsavel;
	private String tarefa;
	
	@Column(columnDefinition = "DATE")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private String data;
	public Tarefa() {
	}

	public Tarefa(String responsavel, String tarefa, String data) {
	    this.responsavel = responsavel;
	    this.tarefa = tarefa;
	    this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getTarefa() {
		return tarefa;
	}
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, id, responsavel, tarefa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(data, other.data) && Objects.equals(id, other.id)
				&& Objects.equals(responsavel, other.responsavel) && Objects.equals(tarefa, other.tarefa);
	}
	
	
}
