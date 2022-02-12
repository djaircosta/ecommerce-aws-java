package com.daytech.ecommerce_aws.controller;

import javax.validation.Valid;

import com.daytech.ecommerce_aws.model.Pedido;
import com.daytech.ecommerce_aws.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/pedido")
public class PedidoController {

  private final PedidoService pedidoService;


  @PostMapping
  public ResponseEntity<Pedido> salvar(@RequestBody @Valid Pedido pedido){
        return ResponseEntity.ok(pedidoService.salvar(pedido));
  }
  
}
