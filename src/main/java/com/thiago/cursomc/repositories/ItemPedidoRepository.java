package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thiago.cursomc.domain.ItemPedido;

//JpaRepository<NomeClasse,TipoPk>
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
