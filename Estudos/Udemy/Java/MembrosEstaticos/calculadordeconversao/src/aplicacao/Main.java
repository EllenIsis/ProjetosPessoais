package aplicacao;

import util.ConversaoMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("QUal cotação do Dolar? ");
        double cotacaoDolar = scanner.nextDouble();
        System.out.print("Qual valor quer mudar para Dolar? ");
        double valor = scanner.nextDouble();
        double resultado = ConversaoMoeda.dolarParaReal(valor,cotacaoDolar);
        System.out.printf("O valor em reais é: %.2f%n", resultado);
        scanner.close();
    }
}