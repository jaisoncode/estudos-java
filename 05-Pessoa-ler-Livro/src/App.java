public class App {
    
    public static void main(String[] args){
        
        Pessoa humano[] = new Pessoa[2];

        Livro book[] = new Livro[2];

        humano[0] = new Pessoa("Jaison", 22, "M");
        humano[1] = new Pessoa("Jse", 12, "F");

        book[0] = new Livro("Java POO", "Json", 203, false, humano[0]);
        book[1] = new Livro("ECMAN Script", "JS", 743, false, humano[1]);

        
        book[0].abrir();
        book[0].folhear();
        book[0].detalhesLivro();
        
    }
}
