package br.com.restaurante.modelo;

import java.time.LocalDate;

/**
 * Classe que representa a entidade Disciplina
 *
 * @author Gabriel Romano
 */
public class Disciplina {

	private Long codigo;
	private String nome;
	private LocalDate criadoEm;
	private LocalDate atualizadoEm;

	public Disciplina(Long codigo, String nome, LocalDate criadoEm) {
		this.codigo = codigo;
		this.nome = nome;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
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
		Disciplina other = (Disciplina) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
