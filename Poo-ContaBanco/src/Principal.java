public class Principal {
    public static void main(String[] args) {
        ContaBanco pessoa = new ContaBanco();
        
        
        pessoa.setNomeDono("Jubileu");
        pessoa.setNumConta(111);
        pessoa.abrirConta("CC");
        pessoa.estadoDaConta();

        pessoa.depositar();
        pessoa.estadoDaConta();
        pessoa.pagarMensal();
        pessoa.sacar();
        pessoa.estadoDaConta();

        



    }
}
