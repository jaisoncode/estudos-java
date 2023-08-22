# Classe ContaBanco em Java 🏦

A classe `ContaBanco` é uma implementação em Java que modela uma conta bancária simples. Essa classe permite simular operações comuns realizadas em contas bancárias, como abertura de conta, fechamento de conta, depósito, saque e pagamento mensal.

## Principais Funcionalidades 🌟

- Abertura de contas do tipo "CC" (Conta Corrente) e "CP" (Conta Poupança) com valores de saldo iniciais específicos.
- Verificação do estado da conta, incluindo informações como nome do cliente, número da conta, tipo de conta, saldo e status da conta.
- Realização de depósitos e atualização do saldo.
- Realização de saques, com verificação de saldo suficiente antes da operação.
- Pagamento mensal automático com base no tipo de conta, com desconto na tarifa da conta corrente ("CC") ou conta poupança ("CP").
- Fechamento de conta, levando em consideração o saldo e o status da conta.
- Utilização de formatação de saída para apresentação clara e organizada dos detalhes da conta.

## Como Usar 🚀

1. Instancie a classe `ContaBanco` para criar uma nova conta bancária.
2. Utilize os métodos disponíveis para realizar operações como abertura, fechamento, depósito, saque e pagamento mensal.
3. Chame o método `estadoDaConta()` para verificar o estado atual da conta.

