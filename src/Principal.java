import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultarCEP consultarCEP = new ConsultarCEP();

        System.out.println("Digite um CEP");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultarCEP.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.GeraArquivo(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando o app");
        }
    }
}
