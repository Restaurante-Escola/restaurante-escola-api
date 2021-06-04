package br.com.restaurante.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.restaurante.model.Advertencia;

public class AdvertenciaDto {

	private Long codigo;

	private Long matriculaAluno;

	private String dataDescricao;

	private String descricao;
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(Long matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getDataDescricao() {
		return dataDescricao;
	}

	public void setDataDescricao(String dataDescricao) {
		this.dataDescricao = dataDescricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public AdvertenciaDto(Advertencia advertencia) {
		this.codigo = advertencia.getCodigo();
		this.matriculaAluno = advertencia.getAluno().getMatricula();
		this.descricao = advertencia.getDescricao();		
		if (advertencia.getDataDescricao() != null) {
			this.dataDescricao = advertencia.getDataDescricao().toString();
		}
	}

	public static List<AdvertenciaDto> converter(List<Advertencia> listaAdvertencia) {
		return listaAdvertencia.stream().map(advertencia -> new AdvertenciaDto(advertencia)).collect(Collectors.toList());
	}

	public static AdvertenciaDto converter(Advertencia advertencia) {
		return new AdvertenciaDto(advertencia);
	}
}
