package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.Frequencia;

@Repository
public interface FrequenciaAlunoRepository extends JpaRepository<Frequencia, Long> { // <Classe, Tipo da Chave Primaria>

}