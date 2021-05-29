package br.com.restaurante.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.restaurante.model.Aluno;

//classe apenas para representar o que devolvemos pro cliente por JSON
public class AlunoDto {
	
	//colocar atributos que devolvemos pro cliente
	
	//tem que botar a matricula
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AlunoDto(Aluno aluno) {
		this.nome = aluno.getNome();
		// fazer o mesmo para futuros atributos
	}

	public static List<AlunoDto> converter(List<Aluno> alunos) {
		// TEM QUE IMPLEMENTAR
		return alunos.stream().map(AlunoDto::new).collect(Collectors.toList());
	}

	public static AlunoDto converter(Aluno aluno) {
		return new AlunoDto(aluno);
	}

}
