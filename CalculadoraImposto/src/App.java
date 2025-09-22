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

        System.out.print("\nQual o valor (USD) do Produto? = US$");
        double valorBrutoProduto = usuario.nextDouble();

        System.out.print("\nQual o valor do frete (USD) do Produto? = US$");
        double valorBrutoFrete = usuario.nextDouble();

        System.out.print("\nQual a origem do Produto? \n1-China\n2-União Europeia\n3-Japão\n4-Coreia do Sul\n5-Vietnã\n6-Tailândia\n7-Canadá\n8-México\n9-Outros\nPaís: ");
        int origem = usuario.nextInt();
        usuario.nextLine();

        if (origem == 7 || origem == 8) {
            System.out.print("\nA negociação envolve a UMSCA? (S/N)");
            String respostaUsuario = usuario.nextLine();
        
            if (respostaUsuario.equals("S")) {
                boolean comUMSCA = true;
            } else if (respostaUsuario.equals("N")) {
                boolean comUMSCA = false;
            }
            
        }
        
        System.out.print("\nQual a categoria do Produto\n1-Geral\n2-Fármacos\n3-Semicondutores\n4-Cobre\n5-Madeira\n6-Energia/Minerais\n7-Metais Preciosos\nCategoria: ");
        int categoria = usuario.nextInt();
        
        usuario.close();

    }


}
