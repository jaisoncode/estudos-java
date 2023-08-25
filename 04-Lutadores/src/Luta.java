import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    

    public void marcarLuta(Lutador l1, Lutador l2) {
        
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.isAprovada()) {
            getDesafiado().apresentar();
            getDesafiante().apresentar();
            
            Random lutadorAleatorio = new Random();
            int vencedor = lutadorAleatorio.nextInt(3);
           
            switch (vencedor) {
                case 0:
                    System.out.println("Empate ! ! !");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    this.desafiado.status();
                    this.desafiante.status();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() +" Ganhou a luta ! !");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    this.desafiado.status();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() +" Ganhou a luta ! !");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    this.desafiante.status();
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    // métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
