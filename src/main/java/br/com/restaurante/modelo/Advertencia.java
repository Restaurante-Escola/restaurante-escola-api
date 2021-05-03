package br.com.restaurante.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Advertencia {

//	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private Aluno aluno;
	private Turma turma;
	private String descricao;
	private LocalDate criadoEm;
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
