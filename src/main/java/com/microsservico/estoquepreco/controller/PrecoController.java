// Define o pacote para esta classe controladora.
package com.microsservico.estoquepreco.controller;

// Importa as classes e pacotes necessários.
import com.microsservico.estoquepreco.constantes.RabbitmqConstantes;
import com.microsservico.estoquepreco.dto.PrecoDto;
import com.microsservico.estoquepreco.service.RabbitmqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Declara a classe como um controlador REST.
@RestController
// Define o mapeamento de URL base para este controlador processar requisições em '/preco'.
@RequestMapping(value = "preco")
public class PrecoController {

    // Injeta automaticamente a dependência RabbitmqService para interagir com o RabbitMQ.
    @Autowired
    private RabbitmqService rabbitmqService;

    // Define um mapeamento PUT para atualizar informações de preço.
    @PutMapping
    private ResponseEntity alteraPreco(@RequestBody PrecoDto precoDto){
        // Utiliza o rabbitmqService para enviar a mensagem contendo os novos detalhes de preço para a fila especificada.
        this.rabbitmqService.enviaMensagem(RabbitmqConstantes.FILA_PRECO, precoDto);

        // Retorna um status HTTP OK indicando que a requisição foi bem-sucedida.
        return new ResponseEntity(HttpStatus.OK);
    }
}