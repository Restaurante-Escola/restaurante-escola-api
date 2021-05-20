package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.AlunoTurma;

@Repository
public interface AlunoTurmaRepository extends JpaRepository<AlunoTurma, Long> {
  
}
