package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Produto;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
