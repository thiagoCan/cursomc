package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.Categoria;
import com.thiago.cursomc.domain.Pedido;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
