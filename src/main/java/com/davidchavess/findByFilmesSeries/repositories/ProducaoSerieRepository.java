package com.davidchavess.findByFilmesSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidchavess.findByFilmesSeries.entidades.ProducaoSerie;

@Repository
public interface ProducaoSerieRepository extends JpaRepository<ProducaoSerie, Long> {

}
