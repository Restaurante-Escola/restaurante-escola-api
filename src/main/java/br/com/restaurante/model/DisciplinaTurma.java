package br.com.restaurante.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DisciplinaTurma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_disciplina_turma")
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "cd_disciplina")
	private Disciplina disciplina;

	@ManyToOne
	@JoinColumn(name = "cd_turma")
	private Turma turma;

	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;

	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;

	@Deprecated
	public DisciplinaTurma() {
	}

	public DisciplinaTurma(Long codigo, Disciplina disciplina, Turma turma, LocalDate criadoEm) {
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.turma = turma;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public LocalDate getCriadoEm() {
		return criadoEm;
	}

	public void setAtualizadoEm(LocalDate atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	public LocalDate getAtualizadoEm() {
		return atualizadoEm;
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
		DisciplinaTurma other = (DisciplinaTurma) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
