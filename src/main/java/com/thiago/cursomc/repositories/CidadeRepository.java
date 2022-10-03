package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Cidade;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
