package br.com.restaurante.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.restaurante.model.OcorrenciaDiario;

public class OcorrenciaDiarioDto {
	
	private Long codigo;
	
	private String matricula;

	private String ocorrencia;

	private String dataOcorrencia;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
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

	public OcorrenciaDiarioDto(OcorrenciaDiario ocorrenciaDiario) {
		this.codigo = ocorrenciaDiario.getCodigo();
		this.matricula = ocorrenciaDiario.getAluno().getMatricula().toString(); 
		//pode dar problema no parse do long para string
		//se der, mudar a matricula no json para long
		this.ocorrencia = ocorrenciaDiario.getOcorrencia();
		this.dataOcorrencia = ocorrenciaDiario.getDataOcorrencia().toString();
	}

	public static List<OcorrenciaDiarioDto> converter(List<OcorrenciaDiario> listaOcorrenciaDiario) {
		return listaOcorrenciaDiario.stream().map(ocorrenciaDiario -> new OcorrenciaDiarioDto(ocorrenciaDiario)).collect(Collectors.toList());
	}

	public static OcorrenciaDiarioDto converter(OcorrenciaDiario ocorrenciaDiario) {
		return new OcorrenciaDiarioDto(ocorrenciaDiario);
	}
}
