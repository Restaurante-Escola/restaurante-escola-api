package br.com.restaurante.modelo;

import java.time.LocalDate;

public class Turma {
	
	private Long codigo;
	private Integer numero;
	private LocalDate criadoEm;
	private LocalDate atualizadoEm;
	
	public Turma(Long codigo, Integer numero, LocalDate criadoEm) {
		this.codigo = codigo;
		this.numero = numero;
		this.criadoEm = criadoEm;
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
		Turma other = (Turma) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
