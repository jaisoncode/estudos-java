public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // métodos
    public void apresentar(){
        System.out.println(String.format("""
                ----- APRESENTAÇÃO DO LUTADOR ----
                NOME:     %s
                ORIGEM:   %s
                IDADE:    %d
                ALTURA:   %.2f m
                PESO:     %.2f Kg
                VITÓRIAS: %d
                DERROTAS: %d
                EMPATES:  %d 
                """, this.getNome(), this.getNacionalidade(), this.getIdade(), this.getAltura(), this.getPeso(), this.getVitorias(), this.getDerrotas(), this.getEmpates()));
    }
    public void status(){
        System.out.println(String.format("""
                ----- STATUS DO LUTADOR ----
                NOME:      %s
                CATEGORIA: %s
                VITÓRIAS:  %d
                DERROTAS:  %d
                EMPATES:   %d 
                """, this.getNome(), this.getCategoria(), this.getVitorias(), this.getDerrotas(), this.getEmpates()));
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    // métodos especiais 
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() { 
        if (this.getPeso() < 52.2) {
            this.categoria = "Peso Inválido - N tem peso mínimo estipulado ";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve ";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio ";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado ";
        } else {
            this.categoria = "Peso Inválido - N tem peso máximo estipulado";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // gets e sets 
    
    
    
    
}
