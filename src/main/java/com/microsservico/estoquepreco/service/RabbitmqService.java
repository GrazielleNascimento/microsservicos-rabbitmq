package com.microsservico.estoquepreco.service; // Define o pacote onde a classe de serviço está localizada.

import org.springframework.amqp.rabbit.core.RabbitTemplate; // Importa RabbitTemplate, uma ferramenta do Spring para enviar mensagens usando AMQP.
import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação Autowired para injeção de dependência.
import org.springframework.stereotype.Service; // Importa a anotação Service para indicar que esta classe é um serviço no contexto do Spring.

/**
 * Classe de serviço responsável por encapsular a lógica de interação com o sistema de mensageria RabbitMQ.
 * Anotada como @Service para ser automaticamente detectada pelo container do Spring e tratada como um bean gerenciado.
 */
@Service
public class RabbitmqService {

    // Injeta uma instância de RabbitTemplate fornecida pelo Spring para uso nesta classe.
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * Método enviaMensagem responsável por enviar mensagens para uma fila específica do RabbitMQ.
     *
     * @param nomeFila O nome da fila para a qual a mensagem será enviada.
     * @param mensagem A própria mensagem que precisa ser enviada. Pode ser qualquer objeto que possa ser serializado.
     */
    public void enviaMensagem(String nomeFila, Object mensagem){
        // Utiliza o RabbitTemplate para enviar a mensagem à fila indicada.
        this.rabbitTemplate.convertAndSend(nomeFila, mensagem);
    }

    // Métodos adicionais podem ser incluídos para suportar outras operações relacionadas ao RabbitMQ.
}