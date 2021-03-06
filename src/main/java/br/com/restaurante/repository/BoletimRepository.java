package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.Boletim;

@Repository
public interface BoletimRepository extends JpaRepository<Boletim, Long> { // <Classe, Tipo da Chave Primaria>

}
