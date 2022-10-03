package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Estado;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
