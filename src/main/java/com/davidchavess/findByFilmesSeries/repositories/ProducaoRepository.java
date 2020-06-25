package com.davidchavess.findByFilmesSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidchavess.findByFilmesSeries.entidades.Producao;

@Repository
public interface ProducaoRepository extends JpaRepository<Producao, Long> {

}
