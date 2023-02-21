package program;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();


        System.out.print("Nome do Produto: ");
        produto.nome = scanner.nextLine();
        System.out.print("Preço do Produto: ");
        produto.preco = scanner.nextDouble();
        System.out.print("Quantidade em Estoque: ");
        produto.quantidade = scanner.nextInt();
        System.out.println();

        System.out.println("Produto: " + produto);

        System.out.println("Quantidade de entrada de estoque: ");
        int quantidade= scanner.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.print("Depois da entrada de estoque: " + produto);

        System.out.println("Quantidade de saída do estoque: ");
        int quantidade1= scanner.nextInt();
        produto.removerProduto(quantidade1);

        System.out.print("Depois da saida de estoque: " + produto);
        scanner.close();
    }
}