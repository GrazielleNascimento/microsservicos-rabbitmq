package com.microsservico.estoquepreco.controller;

import com.microsservico.estoquepreco.constantes.RabbitmqConstantes;
import com.microsservico.estoquepreco.dto.EstoqueDto;
import com.microsservico.estoquepreco.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "estoque")
public class EstoqueController {

    @Autowired
    private RabbitmqService rabbitmqService;

    @PutMapping
    private ResponseEntity alteraEstoque(@RequestBody EstoqueDto estoqueDto){
        System.out.println(estoqueDto.codigoproduto);
        this.rabbitmqService.enviaMensagem(RabbitmqConstantes.FILA_ESTOQUE, estoqueDto);
        return new ResponseEntity(HttpStatus.OK);

    }


}
