package com.davidchavess.findByFilmesSeries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidchavess.findByFilmesSeries.entidades.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
