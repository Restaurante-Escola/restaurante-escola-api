package br.com.restaurante.controller.dto;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.restaurante.model.Aluno;

//classe apenas para representar o que devolvemos pro cliente por JSON
public class AlunoDto {

	public AlunoDto(Aluno aluno) {
		// TEM QUE IMPLEMENTAR
	}

	public static ResponseEntity<AlunoDto> converter(List<Aluno> alunos) {
		// TEM QUE IMPLEMENTAR
		return null;
	}

	public static ResponseEntity<AlunoDto> converter(Aluno aluno) {
		// TEM QUE IMPLEMENTAR
		return null;
	}

}
