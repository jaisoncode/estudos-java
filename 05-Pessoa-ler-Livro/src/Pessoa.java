public class Pessoa {
    private String nome , sexo;
    private int idade;
   
    
    // construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
        System.out.println("Fez anivesário! Agora tem: "+ this.getIdade() +"Anos");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}

