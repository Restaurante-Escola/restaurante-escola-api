package br.com.restaurante.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Advertencia {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_advertencia")
	private Long codigo;
	@ManyToOne
	@JoinColumn(name = "cd_matricula_aluno")
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "cd_turma")
	private Turma turma;
	@Column(name = "ds_advertencia")
	private String descricao;
	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;
	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;
	
	public Advertencia() {}

	public Advertencia(Long codigo, Aluno aluno, Turma turma, String descricao, LocalDate criadoEm) {
		this.codigo = codigo;
		this.aluno = aluno;
		this.turma = turma;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Turma getTurma() {
		return turma;
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
