package br.com.restaurante.controller.form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

import br.com.restaurante.model.Turma;

public class TurmaForm {
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@NotNull
	private Integer numero;
	
	private String inicioTurma;
	
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
	
	public Turma converterAtualizar(Turma turma) {
		return new Turma(turma.getCodigo(), numero, LocalDate.parse(inicioTurma, formatter));
	}
	
	public Turma converterParaCriar() {
		return new Turma(numero, LocalDate.parse(inicioTurma, formatter));
	}
}
