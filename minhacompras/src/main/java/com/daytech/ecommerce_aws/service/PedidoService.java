package com.daytech.ecommerce_aws.service;

import com.daytech.ecommerce_aws.model.Pedido;
import com.daytech.ecommerce_aws.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class PedidoService {

      private final PedidoRepository pedidoRepository;

      public Pedido salvar(Pedido pedido) {
         return pedidoRepository.save(pedido);

      }


}
