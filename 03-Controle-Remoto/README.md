# Controle Remoto Java

Este repositório contém um exemplo de implementação de um controle remoto em Java, que utiliza o conceito de encapsulamento para controlar várias funcionalidades, como ajuste de volume, ligar/desligar e controle de reprodução.

## Descrição

Este projeto visa demonstrar a aplicação do encapsulamento em programação orientada a objetos através da implementação da classe `ControleRemoto`. Essa classe simula um controle remoto com funcionalidades típicas encontradas em aparelhos eletrônicos.

## Funcionalidades

- Ligar e desligar o controle remoto
- Ajustar o volume, aumentando ou diminuindo
- Ativar e desativar a reprodução
- Modo mudo (volume zero)
- Exibir informações no menu

## Uso

Aqui estão algumas das principais operações que podem ser realizadas com a classe `ControleRemoto`:

```java
// Criar uma instância do controle remoto
ControleRemoto controle = new ControleRemoto();

// Ligar o controle remoto
controle.ligar();

// Aumentar o volume
controle.maisVolume();

// Iniciar a reprodução
controle.play();

// Exibir informações no menu
controle.abrirMenu();

// Diminuir o volume
controle.menosVolume();

// Pausar a reprodução
controle.pause();

// Desligar o controle remoto
controle.desligar();
