package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> { // <Classe, Tipo da Chave Primaria>

}