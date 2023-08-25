public class App {
    public static void main(String[] args){
       
        Lutador l[] = new Lutador[6];


        l[0] = new Lutador("Goku", "Japão", 37, 1.77, 69.8, 10, 0, 0);
        l[1] = new Lutador("Gohan", "Japão", 22, 1.80, 64.8, 7, 3, 1);
        l[2] = new Lutador("Vegeta", "Japão", 40, 1.66, 80.8, 9, 2, 0);
        l[3] = new Lutador("Doido das tapioca", "BR", 18, 1.77, 79.9, 9, 2, 0);
        l[4] = new Lutador("Bolota", "EUA", 23, 1.63, 100.8, 8, 8, 10);
        l[5] = new Lutador("Arale", "EUA", 21, 1.63, 102.8, 8, 8, 10);
        
        
        

        Luta combate = new Luta();
        combate.marcarLuta(l[4], l[5]);
        combate.lutar();
        

        
        
    }

   

   // public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
}
