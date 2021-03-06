package br.com.restaurante.controller.form;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.NotNull;

import br.com.restaurante.model.Aluno;
import br.com.restaurante.model.OcorrenciaDiario;

public class OcorrenciaDiarioForm {
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@NotNull
	private Long matricula;

	private String ocorrencia;

	private String dataOcorrencia; //nao pode mandar data assimn: 1/1/2019, tem que ser sempre 01/01/2019
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getDataOcorrencia() {
		return dataOcorrencia;
	}

	public void setDataOcorrencia(String dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	public OcorrenciaDiario converter(Long codigo, Aluno aluno) {
		//se der problema no parse, tentar colocar a matricula como long no json
		return new OcorrenciaDiario(codigo, aluno, ocorrencia, LocalDate.parse(dataOcorrencia, formatter));
	}
	
	public OcorrenciaDiario converter(Aluno aluno) {
		return new OcorrenciaDiario(aluno, ocorrencia, LocalDate.parse(dataOcorrencia, formatter));
	}
}
