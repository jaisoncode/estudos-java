import java.util.Scanner;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totalPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    public Livro(String titulo, String autor, int totalPaginas, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;  
        this.setLeitor(leitor);; 
    }
    
    public void detalhesLivro(){
        System.out.println(String.format("""
                -------------------------
                ----DETALHES----
                |TITULO:| %s
                |AUTOR: | %s
                |T.PAG: | %s
                |ABERTO:| %b
              |P. ATUAL:| %d
                |LEITOR:| %s
                |IDADE: | %d
                |SEXO:  | %s
        """, this.getTitulo(), this.getAutor(),
             this.getTotalPaginas(), this.isAberto(), this.getPagAtual(), this.leitor.getNome(), this.leitor.getIdade(), this.leitor.getSexo() ));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    // interface

    @Override
    public void abrir() {
        if (this.isAberto() == false) {
            this.setAberto(true);
            this.setPagAtual(1);
            System.out.println("Livro aberto, leia...");
        }
       
    }

    @Override
    public void avancarPag() {
        if (this.isAberto() && this.getTotalPaginas() > this.getPagAtual() ) {
            this.setPagAtual(this.getPagAtual() + 1);
             System.out.println("Você passou uma pag, estamos na: "+ this.getPagAtual() +"Pag.");
        } else{
            System.out.println("Você já chegou ao fim do livro");
        } 
        
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            this.setPagAtual(0);        
        } else {
            System.out.println("livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas pag folhear? ->");
        int folheada = entrada.nextInt();
        if ( this.isAberto() && (this.getPagAtual() + folheada) <= this.getTotalPaginas()) {
            this.setPagAtual(this.getPagAtual() + folheada);
            System.out.println("Você folheou "+ folheada +" paginas");
            System.out.println("E chegou na pag "+ this.getPagAtual());
        } else if (this.isAberto() == false) {
            System.out.println("Impossível folhear! Primeiro abra o livro");
        } else {
            System.out.println("Exede o total de paginas, folhei menos");
        }
        entrada.close();
    }

    @Override
    public void voltarPag() {
        if (this.isAberto() && this.getPagAtual() != 0) {
            this.setPagAtual(this.getPagAtual() - 1);

        } else {
            System.out.println("Impossivel voltar");
        }
        
    }
    

}
