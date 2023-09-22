# Sistema Bancário Simples em Java 💰

Este é um projeto de um sistema bancário simples desenvolvido em Java. O sistema permite a criação de titulares de contas bancárias, o cadastro de contas associadas a esses titulares e a realização de operações bancárias básicas, como saque, depósito e transferência de saldo entre contas.

## Funcionalidades Principais 🚀

O sistema bancário possui as seguintes funcionalidades principais:

1. **Cadastro de Titulares** 📋: Os usuários podem cadastrar titulares, fornecendo seus nomes. Cada titular tem um identificador único (ID) gerado automaticamente.

2. **Cadastro de Contas** 🏦: Após cadastrar titulares, os usuários podem criar contas associadas a esses titulares. Cada conta tem uma descrição, um número de conta e um saldo inicial de R$ 0,00.

3. **Operações Bancárias** 💳: Os titulares podem realizar as seguintes operações em suas contas:
   - Saque 💸: Retirar dinheiro da conta, desde que haja saldo disponível.
   - Depósito 💰: Adicionar dinheiro à conta.
   - Transferência 🔄: Transferir dinheiro entre contas, desde que haja saldo disponível. No entanto, para realizar uma transferência, o banco deve ter pelo menos duas contas cadastradas.

4. **Alteração de Dados** ✏️: Os usuários podem alterar o nome dos titulares e as informações das contas, como descrição e número da conta.

5. **Remoção de Titulares e Contas** 🗑️: Os titulares e suas contas associadas podem ser removidos do sistema.

6. **Listagem de Titulares e Contas** 📜: Os titulares e suas contas podem ser listados para visualização.

## Estrutura do Projeto 🏗️

O projeto é composto por três classes principais:

1. **Banco** 🏦: Responsável por gerenciar os titulares e as contas. Realiza operações como transferência de saldo entre contas e fornece acesso às listas de titulares e contas.

2. **Titular** 👤: Representa um titular de conta bancária. Cada titular tem um nome único e pode ter uma ou mais contas associadas a ele.

3. **Conta** 💼: Representa uma conta bancária. Cada conta tem uma descrição, um número de conta, um saldo e está associada a um titular.

## Utilização do Projeto 🛠️

Para utilizar o sistema, siga estas etapas:

1. Execute o programa principal, `Principal.java`.

2. A partir do menu principal, você pode:
   - Cadastrar titulares.
   - Cadastrar contas associadas a titulares.
   - Selecionar uma conta para operar.
   - Sair do programa.

3. Ao selecionar uma conta para operar, você pode:
   - Realizar saques.
   - Realizar depósitos.
   - Realizar transferências (desde que haja pelo menos duas contas no banco).
   - Exibir o saldo da conta.
   - Voltar ao menu principal.

## Melhorias Futuras 📈

Este sistema bancário simples pode ser aprimorado com recursos adicionais, como autenticação de usuários, histórico de transações, consultas de saldo sem a realização de operações e uma interface de usuário mais amigável.

## Considerações Finais 📝

O projeto tem finalidade de estudos e prática! Este projeto demonstra os conceitos básicos de programação orientada a objetos em Java e fornece uma base sólida para o desenvolvimento de sistemas bancários mais complexos no futuro.

