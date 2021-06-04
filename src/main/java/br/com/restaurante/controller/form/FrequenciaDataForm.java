package br.com.restaurante.controller.form;

import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

public class FrequenciaDataForm {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@NotNull(message = "O campo numeroTurma é obrigatório")
	private Integer numeroTurma;

	@NotNull(message = "O campo dataAula é obrigatório") 
	private String dataAula;

	public Integer getNumeroTurma() {
		return numeroTurma;
	}

	public void setNumeroTurma(Integer numeroTurma) {
		this.numeroTurma = numeroTurma;
	}

	public String getDataAula() {
		return dataAula;
	}

	public void setDataAula(String dataAula) {
		this.dataAula = dataAula;
	}
}
