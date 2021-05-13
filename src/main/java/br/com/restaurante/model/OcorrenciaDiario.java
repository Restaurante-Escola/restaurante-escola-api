package br.com.restaurante.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "OCORRENCIA_DIARIO")
public class OcorrenciaDiario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_ocorrencia")
	@NotNull
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "cd_turma")
	private Turma turma;

	@ManyToOne
	@JoinColumn(name = "cd_matricula_aluno")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "cd_frequencia_aluno")
	private Frequencia frequencia;

	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;

	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;
	
	@Deprecated
	public OcorrenciaDiario() {}

	public OcorrenciaDiario(Long codigo, Turma turma, Aluno aluno, LocalDate criadoEm) {
		this.codigo = codigo;
		this.turma = turma;
		this.aluno = aluno;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Turma getTurma() {
		return turma;
	}

	public Aluno getAluno() {
		return aluno;
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
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
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
		OcorrenciaDiario other = (OcorrenciaDiario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
