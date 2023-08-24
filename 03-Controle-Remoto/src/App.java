public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.play();
        controle.abrirMenu();
    }
}
