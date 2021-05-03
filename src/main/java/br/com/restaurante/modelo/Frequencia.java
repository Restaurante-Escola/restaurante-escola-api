//package br.com.restaurante.modelo;
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//import com.sun.istack.NotNull;
//
//@Entity
//public class Frequencia {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "cd_frequencia")
//	@NotNull
//	private Long codigo;
//
////	@Column(name = "cd_turma")
////	private Turma turma;
////
////	@Column(name = "cd_matricula_aluno")
////	private Aluno aluno;
//
//	@Column(name = "dt_aula")
//	private LocalDate dataAula;
//
//	@Column(name = "ic_aluno_presente")
//	private LocalDate alunoPresente;
//
//	@Column(name = "dt_criado_em")
//	private LocalDate criadoEm;
//
//	@Column(name = "dt_atualizado_em")
//	private LocalDate atualizadoEm;
//	
//	@Deprecated
//	public Frequencia() {}
//
//	public Frequencia(Long codigo, Turma turma, Aluno aluno, LocalDate dataAula, LocalDate alunoPresente,
//			LocalDate criadoEm) {
//		this.codigo = codigo;
////		this.turma = turma;
////		this.aluno = aluno;
//		this.dataAula = dataAula;
//		this.alunoPresente = alunoPresente;
//		this.criadoEm = criadoEm;
//	}
//
//	public Long getCodigo() {
//		return codigo;
//	}
//
////	public Turma getTurma() {
////		return turma;
////	}
////
////	public Aluno getAluno() {
////		return aluno;
////	}
//
//	public LocalDate getDataAula() {
//		return dataAula;
//	}
//
//	public LocalDate getAlunoPresente() {
//		return alunoPresente;
//	}
//
//	public LocalDate getCriadoEm() {
//		return criadoEm;
//	}
//
//	public LocalDate getAtualizadoEm() {
//		return atualizadoEm;
//	}
//
////	public void setTurma(Turma turma) {
////		this.turma = turma;
////	}
////
////	public void setAluno(Aluno aluno) {
////		this.aluno = aluno;
////	}
//
//	public void setAtualizadoEm(LocalDate atualizadoEm) {
//		this.atualizadoEm = atualizadoEm;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Frequencia other = (Frequencia) obj;
//		if (codigo == null) {
//			if (other.codigo != null)
//				return false;
//		} else if (!codigo.equals(other.codigo))
//			return false;
//		return true;
//	}
//
//}
