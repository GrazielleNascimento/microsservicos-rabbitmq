package com.microsservico.estoquepreco.dto; // Define o pacote para as classes de transferência de dados (DTO).

import java.io.Serializable; // Importa a interface Serializable necessária para serialização de objetos.

/**
 * Classe EstoqueDto que representa um Data Transfer Object (DTO) para o estoque.
 * Esta classe é utilizada para transferir informações de estoque entre diferentes camadas da aplicação.
 * Implementa a interface Serializable permitindo que suas instâncias possam ser facilmente serializadas e deserializadas,
 * o que é particularmente útil quando se trabalha com mensageria ou ao salvar estados em sistemas distribuídos.
 */
public class EstoqueDto implements Serializable {

    // Variável pública `codigoproduto` que armazena o código identificador do produto.
    public String codigoproduto;

    // Variável pública `quantidade` que armazena a quantidade de itens em estoque para o produto.
    public int quantidade;


}