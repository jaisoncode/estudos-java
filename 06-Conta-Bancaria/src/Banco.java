import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int idBanco;
    private List<Titular> titulares;
    private List<Conta> contas;

    public Banco() {
        this.idBanco = 1;
        this.titulares = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
    public boolean trasferirSaldo(Conta contaEmOperacao, int idTitular, int idConta, double valorTranferencia){
        List<Titular> titulares = Principal.banco.getTitulares();
        for (Titular titular: titulares) {
            if (titular.getId() == idTitular) { //verificao titular
                System.out.print("Titular: "+ titular.getNome());
                for (Conta contaRecebe: titular.getContasTitular()) {
                    if (contaRecebe.getId() == idConta) {
                        if (contaEmOperacao.getSaldo() < valorTranferencia) {
                            return false;
                        } else {
                            contaRecebe.setSaldo(contaRecebe.getSaldo() + valorTranferencia);
                            contaEmOperacao.setSaldo(contaEmOperacao.getSaldo() - valorTranferencia);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public Conta operarConta(int idTitular, int idConta){
       List<Titular> titulares = Principal.banco.getTitulares();
        for (Titular titular: titulares) {
            if (titular.getId() == idTitular) { //verificao titular
                System.out.print("Titular: "+ titular.getNome());
                for (Conta contaOperante: titular.getContasTitular()) {
                    if (contaOperante.getId() == idConta) {
                        Conta contaOpera = contaOperante;
                        System.out.println(" | Conta operante: " +contaOperante);
                        return contaOpera;
                    }
                }
            }
        }
        return null;
    }
    public int getIdBanco(){
        return idBanco;
    }
    
    public void adiconarTitular(Titular titular){
        this.titulares.add(titular);
    }
    public Titular alterarTitular(int id, String nome){
        List<Titular> titulares = Principal.banco.getTitulares();
        for (Titular titular : titulares) {
            if (titular.getId() == id) {
                titular.setNome(nome);
                return titular;
            }
        }
        return null;
    }
    public Titular removerTitular(int id) {
        List<Titular> titulares = Principal.banco.getTitulares();
        for (Titular titular : titulares) {
            if (titular.getId() == id) {
                titulares.remove(titular);
                return titular;
            }
        }
        return null;
    }
    public void adionarConta(Conta novaConta) {
       this.contas.add(novaConta);
    }
    public Conta alterarConta(int id, String desc, int numeroConta){
        List<Conta> contas = Principal.banco.getContas();
        for (Conta conta : contas) {
            if (conta.getId() == id) {
                conta.setDescricao(desc);
                conta.setNumeroConta(numeroConta);
                return conta;
            }
        }
        return null;
    }
    public Conta removeConta(int id) {
        List<Conta> contas = Principal.banco.getContas();
        for (Conta conta: contas) {
            if (conta.getId() == id) {
                contas.remove(conta);
                return conta;
            }
        }
        return null;
    }

    public List<Titular> getTitulares() {
        return titulares;
    }

    public List<Conta> getContas() {
        return contas;
    }

}