package br.com.restaurante.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

/**
 * Classe que representa a entidade Feriado
 *
 * @author Gabriel Romano
 */
@Entity
public class Feriado {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "cd_feriado")
	private Long codigo;
	
	@Column(name = "dt_feriado")
	private LocalDate data;
	
	@Column(name = "dt_criado_em")
	private LocalDate criadoEm;

	@Column(name = "dt_atualizado_em")
	private LocalDate atualizadoEm;
	
	@Deprecated
	public Feriado() {
		
	}

	public Feriado(Long codigo, LocalDate data, LocalDate criadoEm) {
		this.codigo = codigo;
		this.data = data;
		this.criadoEm = criadoEm;
	}

	public Long getCodigo() {
		return codigo;
	}

	public LocalDate getData() {
		return data;
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
		Feriado other = (Feriado) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	


}
