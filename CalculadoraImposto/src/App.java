import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //configura leitor 
        Scanner usuario = new Scanner(System.in);
        usuario.useLocale(Locale.US);

        System.out.println("\n///Calculadora de Impostos///\n");
        System.out.print("Qual nome do Produto? = ");
        String nomeProduto = usuario.nextLine();

        System.out.print("Qual o valor (USD) do Produto? = US$");
        double valorBrutoProduto = usuario.nextDouble();

        System.out.print("Qual o valor do frete (USD) do Produto? = US$");
        double valorBrutoFrete = usuario.nextDouble();

        System.out.print("Qual a origem do Produto? ");
        
        usuario.close();

    }

}
