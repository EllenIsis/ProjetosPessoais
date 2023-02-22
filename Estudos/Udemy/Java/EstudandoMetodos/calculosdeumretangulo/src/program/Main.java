package program;

import entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();


        System.out.println("Qual o valor da largura");
        retangulo.largura = scanner.nextDouble();
        System.out.println("Qual o valor da altura");
        retangulo.altura = scanner.nextDouble();
        scanner.close();

        System.out.printf("A area do retangulo é: %.2f%n", retangulo.Area());
        System.out.printf("O perimetro é: %.2f%n", retangulo.Perimetro());
        System.out.printf("A sua diagonal é: %.2f%n", retangulo.Diagonal());
    }
}