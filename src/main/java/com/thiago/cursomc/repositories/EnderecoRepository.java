package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Endereco;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
