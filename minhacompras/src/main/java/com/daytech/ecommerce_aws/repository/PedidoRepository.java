package com.daytech.ecommerce_aws.repository;

import com.daytech.ecommerce_aws.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
  
}
