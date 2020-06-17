package com.davidchavess.findByFilmesSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidchavess.findByFilmesSeries.entidades.ProducaoFilme;

@Repository
public interface ProducaoFilmeRepository extends JpaRepository<ProducaoFilme, Long> {

}
