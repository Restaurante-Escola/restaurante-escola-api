package br.com.restaurante.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Advertencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_advertencia")
	private Long codigo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_matricula_aluno")
	private Aluno aluno;

	@Column(name = "dt_advertencia")
	private String dataDescricao;

	@Column(name = "ds_advertencia")
	private String descricao;

	@Column(name = "dt_criado_em")
	private LocalDate criadoEm = LocalDate.now();

	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;

	public Advertencia() {}

	public Long getCodigo() {
		return codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public LocalDate getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(LocalDate atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCriadoEm(LocalDate criadoEm) {
		this.criadoEm = criadoEm;
	}

	public String getDataDescricao() {
		return dataDescricao;
	}

	public void setDataDescricao(String dataDescricao) {
		this.dataDescricao = dataDescricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advertencia other = (Advertencia) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
