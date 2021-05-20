package br.com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restaurante.model.Advertencia;

@Repository
public interface AdvertenciaRepository extends JpaRepository<Advertencia, Long> { // <Classe, Tipo da Chave Primaria>

}
