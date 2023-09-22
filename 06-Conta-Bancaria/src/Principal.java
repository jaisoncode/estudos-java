import java.util.List;
import java.util.Scanner;

public class Principal {


    static Banco banco;

    private static Scanner leitura;

    public static void main(String[] args) {

        banco = new Banco();
        leitura = new Scanner(System.in);

        while (true) {
            exibirMenuPrincipal();
            int opcao = leitura.nextInt();
            switch (opcao) {
                case 1 -> {
                    espacoLinha();
                    subMenuCadastroTitular();
                }
                case 2 -> {
                    subMenuCadastroDeConta();
                    espacoLinha();
                }
                case 3 -> {
                    espacoLinha();
                    selecionaConta();
                }
                case 4 -> {
                    espacoLinha();
                    System.out.println("Fechando o progrma...");
                    return;
                }
                default -> {
                    espacoLinha();
                    System.out.println("Opção inválida");
                }
            }

        }


    }

    public static void espacoLinha() {
        for (int i = 0; i < 1; i++) {
            System.out.println();
        }
    }

    public static void exibirMenuPrincipal() {
        espacoLinha();
        System.out.println("Menu Principal:");
        System.out.println("1. Cadastro de Titular");
        System.out.println("2. Cadastro de Conta");
        System.out.println("3. Operar conta");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");

    }

    public static void subMenuCadastroTitular() {
        while (true) {
            espacoLinha();
            System.out.println("Menu - Cadastro de Titular:");
            System.out.println("1. Adicionar Titular");
            System.out.println("2. Listar Titulares");
            System.out.println("3. Alterar Dados do titular");
            System.out.println("4. Apagar um titular");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> {
                    while (true) {
                        espacoLinha();
                        System.out.println("CADASTRANDO TITULAR:");

                        System.out.print("Nome do titular: ");
                        String nomeTitular = leitura.nextLine();
                        Titular novoTitular = new Titular(nomeTitular);
                        banco.adiconarTitular(novoTitular);
                        System.out.println("CADASTRADO COM SUCESSO");


                        System.out.println("Cadastrar mais um titular? ( 1 - SIM | 2 - NÃO )");

                        int escolha = leitura.nextInt();
                        leitura.nextLine();
                        if (escolha == 2) {
                            break;
                        } else {
                            System.out.println("cadastre mais um");
                        }
                    }
                }
                case 2 -> {
                    if (banco.getTitulares().isEmpty()) {
                        System.out.println("Banco não pussui titular!");
                        System.out.println("Cadastre um...");
                    } else {
                        System.out.println("LISTA DE TITULARES:");
                        List<Titular> titulares = banco.getTitulares();
                        for (Titular titular : titulares) {
                            System.out.println("ID: " + titular.getId() + " Nome do Titular: " + titular.getNome());
                        }
                    }
                }
                case 3 -> {
                    espacoLinha();
                    System.out.println("Alterar dados do titular");
                    if (banco.getTitulares().isEmpty()) {
                        System.out.println("Banco não possui titular!");
                        System.out.println("Cadastre um...");
                    } else {
                        while (true) {
                            System.out.println("Veja a lista de titulres: ");
                            List<Titular> titulares = banco.getTitulares();
                            for (Titular titular : titulares) {
                                System.out.println("ID: " + titular.getId() + " Nome: " + titular.getNome());
                            }

                            System.out.print("digite o ID do titular alterar: ");
                            int idEscolhido = leitura.nextInt();
                            leitura.nextLine();
                            System.out.print("Digite um novo nome: ");
                            String novoNome = leitura.nextLine();

                            Titular titularAlterado = banco.alterarTitular(idEscolhido, novoNome);

                            if (titularAlterado != null) {
                                System.out.println("Titular alterado com sucesso para: " + titularAlterado.getNome());
                            } else {
                                System.out.println("Nenhum titular com o ID fornecido encontrado.");
                                System.out.println("Informe um ID refente a um titular da lista");
                            }

                            System.out.println("Alterar mais um titular? ( 1 - SIM | 2 - NÃO )");
                            int sair = leitura.nextInt();
                            leitura.nextLine();
                            if (sair != 1) {
                                break;
                            }
                        }
                    }
                }
                case 4 -> {
                    espacoLinha();
                    if (banco.getTitulares().isEmpty()) {
                        System.out.println("Banco não pussui titular!");
                        System.out.println("Cadastre um...");
                    } else {
                        while (true) {
                            System.out.println("Remover titular");
                            System.out.println("Veja a lista de titurales abaixo:");
                            List<Titular> titulares = banco.getTitulares();
                            for (Titular titular : titulares) {
                                System.out.println("ID: " + titular.getId() + " Nome: " + titular.getNome());
                            }

                            System.out.print("digite o ID do titular que quer remover: ");
                            int idEscolhido = leitura.nextInt();
                            leitura.nextLine();

                            Titular titularRemovido = banco.removerTitular(idEscolhido);

                            if (titularRemovido != null) {
                                System.out.println("Titular removido com sucesso: " + titularRemovido.getNome());
                            } else {
                                System.out.println("Nenhum titular com o ID fornecido encontrado.");
                            }
                            System.out.println("Apagar mais um titular? ( 1 - SIM | 2 - NÃO )");
                            int sair = leitura.nextInt();
                            leitura.nextLine();
                            if (sair != 1) {
                                break;
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.println("voltando pro menu principal");
                    return;
                }
                default -> System.out.println("opção inválida");
            }
        }
    }

    public static void subMenuCadastroDeConta() {
        while (true) {
            espacoLinha();
            System.out.println("Menu - Cadastro de Conta:");
            System.out.println("1. Adicionar uma conta");
            System.out.println("2. Listar contas");
            System.out.println("3. Alterar Dados da conta");
            System.out.println("4. Apagar uma conta");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> {
                    while (true) {
                        espacoLinha();
                        System.out.println("**ADICIONAR UMA CONTA**");
                        if (banco.getTitulares().isEmpty()) {
                            System.out.println("Banco não possui titular, cadastre um...");
                            exibirMenuPrincipal();
                        } else {
                            System.out.println("CADASTRANDO CONTA:");

                            List<Titular> titulares = banco.getTitulares();
                            for (Titular titular : titulares) {
                                System.out.println("ID: " + titular.getId() + " Nome do Titular: " + titular.getNome());
                            }

                            System.out.println("Você quer adicionar uma conta para qual titular? ");
                            System.out.print("Informe o ID do titular: ");
                            int idTitular = leitura.nextInt();
                            leitura.nextLine();


                            for (Titular titular : titulares) {
                                if (idTitular == titular.getId()) {
                                    System.out.print("Dê uma breve descrição para sua conta: ");
                                    String descricaoConta = leitura.nextLine();
                                    System.out.print("Dê um numero pra sua conta (ex: 2012) :");
                                    int numeroConta = leitura.nextInt();
                                    leitura.nextLine();
                                    Conta novaConta = new Conta(descricaoConta, numeroConta, titular);
                                    titular.adicionarConta(novaConta);
                                    banco.adionarConta(novaConta);
                                    System.out.println("adicionando...");
                                    System.out.println("Adicionado para " + titular.getNome()
                                            + " -> Descrição: " + descricaoConta
                                            + ". Numero da conta: " + numeroConta);
                                    System.out.println("ADICIONADO COM SUCESSO!!");
                                }
                            }
                            System.out.println("Adionar mais uma conta conta? ( 1 - SIM | 2 - NÃO )");
                            int sair = leitura.nextInt();
                            leitura.nextLine();
                            if (sair != 1) {
                                break;
                            }
                        }
                    }
                }
                case 2 -> {
                    if (banco.getTitulares().isEmpty()) {
                        System.out.println("Banco não pussui titular!");
                        System.out.println("Cadastre um...");
                    } else {
                        System.out.println("LISTA DE CONTAS:");
                        List<Conta> contas = banco.getContas();

                        for (Conta conta : contas) {
                            System.out.println("ID: " + conta.getId()
                                    + " Descrição da conta: " + conta.getDescricao()
                                    + "Numero da conta: " + conta.getNumeroConta());
                        }
                    }
                }
                case 3 -> {
                    espacoLinha();
                    System.out.println("Alterar dados de uma conta");
                    if (banco.getContas().isEmpty()) {
                        System.out.println("Banco não possui conta!");
                        System.out.println("Cadastre uma...");
                    } else {
                        while (true) {
                            System.out.println("Veja a lista de contas: ");
                            List<Conta> contas = banco.getContas();
                            for (Conta conta : contas) {
                                System.out.println("ID: " + conta.getId() + " Descrição: "
                                        + conta.getDescricao() + " Numero da conta: "
                                        + conta.getNumeroConta());
                            }

                            System.out.print("digite o ID do titular alterar: ");
                            int idEscolhido = leitura.nextInt();
                            leitura.nextLine();
                            System.out.print("Digite uma nova descriçao: ");
                            String novoDesc = leitura.nextLine();
                            System.out.println("Digite novo numero da conta");
                            int novoNumeroConta = leitura.nextInt();
                            leitura.nextLine();

                            Conta contaAlterada = banco.alterarConta(idEscolhido, novoDesc, novoNumeroConta);

                            if (contaAlterada != null) {
                                System.out.println("INFORMALÇÔES ALTERADAS!");
                                System.out.println(" Desc: " + novoDesc
                                        + "  Numero da conta: " + novoNumeroConta);
                            } else {
                                System.out.println("Nenhum titular com o ID fornecido encontrado.");
                                break;
                            }
                            System.out.println("Alterar mais uma conta? ( 1 - SIM | 2 - NÃO )");
                            int sair = leitura.nextInt();
                            leitura.nextLine();
                            if (sair != 1) {
                                break;
                            }
                        }
                    }
                }
                case 4 -> {
                    espacoLinha();
                    if (banco.getContas().isEmpty()) {
                        System.out.println("Banco não pussui conta!");
                        System.out.println("Cadastre um...");
                    } else {
                        while (true) {
                            System.out.println("**REMOVER CONTA**");
                            System.out.println("LISTA DE CONTAS:");
                            List<Conta> contas = banco.getContas();
                            for (Conta conta : contas) {
                                System.out.println("ID: " + conta.getId()
                                        + " Descrição da conta: " + conta.getDescricao()
                                        + ". Numero da conta: " + conta.getNumeroConta());
                            }
                            System.out.print("digite o ID da conta que quer remover: ");
                            int idEscolhido = leitura.nextInt();
                            leitura.nextLine();
                            Conta contaRemovida = banco.removeConta(idEscolhido);

                            if (contaRemovida != null) {
                                System.out.println("Titular removido com sucesso: " + contaRemovida.getDescricao());
                            } else {
                                System.out.println("Nenhum titular com o ID fornecido encontrado.");
                            }
                            System.out.println("Adionar mais uma conta conta? ( 1 - SIM | 2 - NÃO )");
                            int sair = leitura.nextInt();
                            leitura.nextLine();
                            if (sair != 1) {
                                break;
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.println("voltando pro menu principal");
                    return;
                }
                default -> System.out.println("opção inválida");
            }

        }

    }


    public static void selecionaConta() {

        List<Titular> titulares = banco.getTitulares();
        if (banco.getTitulares().isEmpty()) {
            System.out.println("Impossível operar conta - Banco não tem titular");
        } else if (banco.getContas().isEmpty()) {
            System.out.println("Impossível operar conta - Banco não tem conta");
        } else {
            while (true) {
                System.out.println("**ESCOLHA UMA CONTA PARA OPERAR**");
                for (Titular titular: titulares) {
                    System.out.println("ID: "+ titular.getId()
                    +" Nome: "+ titular.getNome() +". Contas -> ");
                    for (Conta conta : titular.getContasTitular()) {
                        System.out.println(conta.toString());
                    }
                }

                System.out.print("Escolha um ID correspondente ao titular: ");
                int idTitular = leitura.nextInt();
                leitura.nextLine();
                System.out.print("Escolha um ID correspondente da conta: ");
                int idConta = leitura.nextInt();
                leitura.nextLine();

                Conta contaEmOperacao = banco.operarConta(idTitular, idConta);

                while (true) {
                    if (contaEmOperacao != null) {
                        espacoLinha();
                        System.out.println("**OPERAR CONTA**");
                        System.out.println(contaEmOperacao.toString());
                        System.out.println("1 - Sacar");
                        System.out.println("2 - Depositar");
                        System.out.println("3 - Transferir");
                        System.out.println("4 - Mostrar saldo");
                        System.out.println("5 - Voltar ao menu principal");
                        System.out.print("Escolha uma opção: ");

                        int opcao = leitura.nextInt();
                        leitura.nextLine();
                        switch (opcao) {
                            case 1 -> {
                                System.out.println("**OPERAÇÃO SACAR**");
                                if (contaEmOperacao.getSaldo() == 0){
                                    System.out.println("Operação inválida, sem saldo!");
                                } else {
                                    System.out.print("Valor do saque: ");
                                    double valorSaque = leitura.nextDouble();
                                    leitura.nextLine();
                                    boolean sacou = contaEmOperacao.sacarConta(valorSaque);
                                    if (sacou) {
                                        System.out.println("Saque de "+valorSaque +"R$, realizado");
                                    } else {
                                        System.out.println("Valor de saque inválido, verifique o saldo antes");
                                    }
                                }
                               break;
                            }
                            case 2 -> {
                                System.out.println("**OPERAÇÃO DEPOSITAR**");
                                System.out.print("Valor do deposito: ");
                                double deposito = leitura.nextDouble();
                                leitura.nextLine();
                                boolean depositou = contaEmOperacao.depositarConta(deposito);

                                if (depositou) {
                                    System.out.println("valor Depositado!");
                                } else {
                                    System.out.println("valor invalido!");
                                }
                                break;
                            }
                            case 3 -> {
                                System.out.println("**OPERAÇÃO TRANSFERIR**");
                                if (banco.getContas().size() < 2) {
                                    System.out.println("para trasferir, o banco deve ter " +
                                            "no mínimo 2 contas");
                                    break;
                                }
                                for (Titular titular: titulares) {
                                    System.out.println("ID: "+ titular.getId()
                                            +" Nome: "+ titular.getNome() +". Contas -> ");
                                    for (Conta conta : titular.getContasTitular()) {
                                        System.out.println(conta.toString());
                                    }
                                }

                                System.out.print("Escolha um ID correspondente ao titular: ");
                                int idTitularRecebe = leitura.nextInt();
                                leitura.nextLine();
                                System.out.print("Escolha um ID correspondente da conta: ");
                                int idContaRecebe = leitura.nextInt();
                                leitura.nextLine();
                                System.out.print("Valor da trasferencia: ");
                                double valorTranferido = leitura.nextDouble();
                                leitura.nextLine();

                                boolean contaTraferida = banco.trasferirSaldo(contaEmOperacao,
                                                        idTitularRecebe, idContaRecebe, valorTranferido);
                                if (contaTraferida) {
                                    System.out.println("Trasferencia realizada! ");
                                } else {
                                    System.out.println("Erro, verifique o valor.");
                                }
                                break;
                            }
                            case 4 -> {
                                System.out.println("**OPERAÇÃO EXIBIR SALDO**");
                                System.out.println("Saldo da conta: "+ contaEmOperacao.getSaldo() +"R$");
                            }
                            case 5 -> {
                                System.out.println("Voltando para menu principal...");
                                return;
                            }
                            default -> {
                                System.out.println("Entrada invalida");
                                break;
                            }
                        }
                    } else {
                        System.out.println("Tente novamente! Entre com um id de titular e conta válidos");
                    }
                }

            }
        }
    }

}
