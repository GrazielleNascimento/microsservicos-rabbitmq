package com.microsservico.estoquepreco.dto; // Define o pacote que corresponde à camada de transferência de dados (DTO).

import java.io.Serializable; // Importa a interface Serializable, que habilita os objetos desta classe a serem serializados.

/**
 * Classe PrecoDto que serve como um Data Transfer Object (DTO) para transferir dados de preço do produto,
 * principalmente entre diferentes partes do sistema, como serviços e controladores.
 * Implementa a interface Serializable para permitir sua serialização, o que é útil ao enviar objetos através dos sistemas de mensageria ou redes.
 */
public class PrecoDto implements Serializable {
    // Variável pública para armazenar o código identificador do produto. É recomendado usar getters e setters ao invés de variáveis públicas.
    public String codigoproduto;

    // Variável pública para armazenar o preço associado ao produto. Mesmo que para o 'codigoproduto', é recomendado usar métodos de acesso.
    public double preco;


}