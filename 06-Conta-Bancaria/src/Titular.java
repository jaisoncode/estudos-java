import java.util.ArrayList;
import java.util.List;

public class Titular {
    private static int geraId = 1;
    private int id;
    private String nome;
    private List<Conta> contasTitular;



    public Titular(String nome) {
        this.nome = nome;
        this.id = geraId++;
        this.contasTitular = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        this.contasTitular.add(conta);
    }

    public int getGeraId() {
        return geraId;
    }


    public int getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public List<Conta> getContasTitular() {
        return contasTitular;
    }

}
