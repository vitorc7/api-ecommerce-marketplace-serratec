package com.grupo4.projetofinalapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo4.projetofinalapi.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}