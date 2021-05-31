package br.com.restaurante.controller.form;

import javax.validation.constraints.NotNull;

import br.com.restaurante.model.Aluno;
import br.com.restaurante.model.AlunoTurma;
import br.com.restaurante.model.Turma;

public class AlunoTurmaForm {

	@NotNull
	private Integer numeroTurma;
	
	@NotNull
	private Long matricula;

	public Integer getNumeroTurma() {
		return numeroTurma;
	}

	public void setNumeroTurma(Integer numeroTurma) {
		this.numeroTurma = numeroTurma;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public AlunoTurma converterParaCriar(Aluno aluno, Turma turma) {
		return new AlunoTurma(aluno, turma);
	}
	
	
}
