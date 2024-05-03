public class Principal {
    public static void main(String[] args) {

        ConsultarCEP consultarCEP = new ConsultarCEP();
        Endereco novoEndereco = consultarCEP.buscaEndereco("01001000");
        System.out.println(novoEndereco);


    }
}
