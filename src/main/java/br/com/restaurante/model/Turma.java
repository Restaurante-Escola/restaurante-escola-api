package br.com.restaurante.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_turma")
	@NotNull
	private Long codigo;
	@Column(name = "cd_numero_turma")
	private Integer numero;
	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;
	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;

//	@OneToMany
//	@JoinColumn(name = "turmas") // para nao criar outra tabela intermediaria, dessa vez chamadaturma_disciplinas
//	private List<Disciplina> disciplinas;
	
	@OneToMany(mappedBy = "turma")
	private List<AlunoTurma> turma;
	
	@OneToMany(mappedBy = "turma")
	private List<DisciplinaTurma> turmaDisicplina;

	@OneToMany(mappedBy = "turma")
	private List<Advertencia> advertencias;

	@OneToMany(mappedBy = "turma")
	private List<Frequencia> frequencias;

	@OneToMany(mappedBy = "turma")
	private List<OcorrenciaDiario> ocorrenciaDiario;

	@Deprecated
	public Turma() {
	}

	public Turma(Long codigo, Integer numero, LocalDate criadoEm) {
		this.codigo = codigo;
		this.numero = numero;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Integer getNumero() {
		return numero;
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

	public List<Advertencia> getAdvertencias() {
		return advertencias;
	}

	public void setAdvertencias(List<Advertencia> advertencias) {
		this.advertencias = advertencias;
	}

//	public void setDisciplinas(List<Disciplina> disciplinas) {
//		this.disciplinas = disciplinas;
//	}
//
//	public List<Disciplina> getDisciplinas() {
//		return disciplinas;
//	}

	public List<AlunoTurma> getTurma() {
		return turma;
	}

	public void setTurma(List<AlunoTurma> turma) {
		this.turma = turma;
	}

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}

	public List<OcorrenciaDiario> getOcorrenciaDiario() {
		return ocorrenciaDiario;
	}

	public void setOcorrenciaDiario(List<OcorrenciaDiario> ocorrenciaDiario) {
		this.ocorrenciaDiario = ocorrenciaDiario;
	}
	
	public List<DisciplinaTurma> getTurmaDisicplina() {
		return turmaDisicplina;
	}

	public void setTurmaDisicplina(List<DisciplinaTurma> turmaDisicplina) {
		this.turmaDisicplina = turmaDisicplina;
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
		Turma other = (Turma) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
