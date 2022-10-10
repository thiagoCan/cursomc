package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Pagamento;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
