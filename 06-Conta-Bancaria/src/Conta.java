
public class Conta {
    private static int geraId = 1;
    private int id;
    private String descricao;
    private int numeroConta;
    private double saldo;
    private Titular titularDaConta;

    public Conta(String descricao, int numeroConta, Titular titularDaConta) {
        this.id = geraId++;
        this.saldo = 0;
        this.descricao = descricao;
        this.numeroConta = numeroConta;
        this.titularDaConta = titularDaConta;

    }
    public boolean sacarConta(double valorSaque) {
        if (this.saldo < valorSaque) {
            return false;
        }
        this.saldo -= valorSaque;
        return true;
    }
    public boolean depositarConta(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            return true;
        }
        return false;
    }

    public int getGeraId() {
        return geraId;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitularDaConta() {
        return titularDaConta;
    }

    @Override
    public String toString() {
        return "Descrição: "+ getDescricao() +", ID: "+ getId() +", Conta: "+ getNumeroConta()
                +", Saldo: "+ getSaldo() +"R$";
    }
}

