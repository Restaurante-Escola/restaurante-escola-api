package br.com.restaurante.modelo;

import java.time.LocalDate;

/**
 * Classe que representa a entidade Boletim
 *
 * @author Gabriel Romano
 */
public class Boletim {

	private Long codigo;
	private Disciplina disciplina;
	private Aluno aluno;
	private Integer nota;	
	private LocalDate criadoEm;
	private LocalDate atualizadoEm;
	
	public Boletim(Long codigo, Disciplina disciplina, Aluno aluno, Integer nota, LocalDate criadoEm) {
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.nota = nota;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Integer getNota() {
		return nota;
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
		Boletim other = (Boletim) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
