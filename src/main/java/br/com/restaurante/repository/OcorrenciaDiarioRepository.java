package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.OcorrenciaDiario;

@Repository
public interface OcorrenciaDiarioRepository extends JpaRepository<OcorrenciaDiario, Long> { // <Classe, Tipo da Chave Primaria>

}