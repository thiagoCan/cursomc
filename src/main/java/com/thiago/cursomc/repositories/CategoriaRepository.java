package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Categoria;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
