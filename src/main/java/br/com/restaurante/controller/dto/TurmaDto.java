package br.com.restaurante.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.restaurante.model.Turma;

public class TurmaDto {
	
	private Integer numero;
	
	private String inicioTurma = "indefinido";
	
	private String fimTurma = "indefinido";
	
	//no futuro colocar os atributos alunos, bla bla bla
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getInicioTurma() {
		return inicioTurma;
	}

	public void setInicioTurma(String inicioTurma) {
		this.inicioTurma = inicioTurma;
	}

	public String getFimTurma() {
		return fimTurma;
	}

	public void setFimTurma(String fimTurma) {
		this.fimTurma = fimTurma;
	}

	public TurmaDto(Turma turma) {
		this.numero = turma.getNumero();
		this.inicioTurma = turma.getInicioTurma().toString();
		if (turma.getFimTurma() != null) {
			this.fimTurma = turma.getFimTurma().toString();
		}
	}
	
	public static List<TurmaDto> converter(List<Turma> listaTurma) {
		return listaTurma.stream().map(turma -> new TurmaDto(turma)).collect(Collectors.toList());
	}

	public static TurmaDto converter(Turma turma) {
		return new TurmaDto(turma);
	}

}
