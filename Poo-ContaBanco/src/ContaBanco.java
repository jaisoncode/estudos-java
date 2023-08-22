import java.util.Scanner;

public class ContaBanco {
     public int numConta;
     protected String tipoDeConta;
     private String nomeDono;
     private double saldo;
     private boolean statusDaConta;
   
     Scanner leitura = new Scanner(System.in);

    public void estadoDaConta(){
        String exibirEstado = String.format("""
                ******************
                Nome do Cliente: %s
                Número da conta: %d
                Tipo da conta:   %s
                Saldo da conta:  R$%.2f
                Status da conta: %b
                """, this.getNomeDono(), this.getNumConta(), this.getTipoDeConta(),
                     this.getSaldo(), this.isStatusDaConta());

                     
        
        System.out.println(exibirEstado);
    }
    public void abrirConta(String t) {
        this.setTipoDeConta(t);
        this.setStatusDaConta(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")){
            this.setSaldo(150);
        }
    }
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Erro, você não pode encerrar a conta.");
            System.out.println("Seu Saldo está negativo: "+ saldo);
        
        } else if (this.getSaldo() > 0) {
            System.out.println("Erro, você não pode encerrar a conta.");
            System.out.println("Você tem : "+ saldo +" de saldo!");
        
        } else {
            this.setStatusDaConta(false);
            System.out.println("Conta encerrada! (Fechada)");
        }
        
    }
    public void depositar() {
        if (this.isStatusDaConta() == true) {
            System.out.println("Valor do deposito? ");
            double valorDepositado = leitura.nextDouble();
            this.setSaldo(getSaldo() + valorDepositado);
            System.out.println("Saldo atualizado! Saldo: "+ this.getSaldo());
        } else {
            System.out.println("Erro, a conta está fechada ");
        }
        
    }
    public void sacar() {
        if (this.isStatusDaConta() == true){
            System.out.println("Qual valor você quer sacar? ");  
            double valorSaque = leitura.nextDouble();
            if (this.getSaldo() < valorSaque) {
                System.out.println("Erro, saldo insuficiênte!! ");
            } else {
                this.setSaldo(getSaldo() - valorSaque);
                System.out.println("Saque feito! Seu saldo é "+ this.getSaldo());
            }
        }
        else {
            System.out.println("Erro! A conta está fechada!!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipoDeConta() == "CC") {
            v = 12;
        } else if (this.getTipoDeConta() == "CP") {
            v = 20;
        }
        if (this.isStatusDaConta() == true) {
            if (this.getSaldo() < v) {
                System.out.println("Erro saldo insuficiente");
            } else {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Tarifa paga! Saldo atual: "+ this.getSaldo());
            }
        } else {
            System.out.println("A conta está fechada, não se paga tarifa. ");
        }

    }
    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.statusDaConta = false;
    }
    //Get e set ***********************
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatusDaConta() {
        return statusDaConta;
    }
    public void setStatusDaConta(boolean statusDaConta) {
        this.statusDaConta = statusDaConta;
    }

    
}