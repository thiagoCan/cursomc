package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Cliente;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
