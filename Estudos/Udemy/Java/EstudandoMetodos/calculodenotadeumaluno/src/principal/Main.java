package principal;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Qual o seu nome: ");
        estudante.nome = scanner.nextLine();
        System.out.println("Qual a nota do 1º Trimestre");
        estudante.nota1 = scanner.nextDouble();
        System.out.println("Qual a nota do 2º Trimestre");
        estudante.nota2 = scanner.nextDouble();
        System.out.println("Qual a nota do 3º Trimestre");
        estudante.nota3 = scanner.nextDouble();

        System.out.printf("Nota Final: %.2f.%n",estudante.NotaFinal());
        if (estudante.NotaFinal() < 60.0){
            System.out.println("Reprovado.");
            System.out.printf("Faltam %.2f pontos.%n", estudante.PontoFaltante());
        }
        else {
            System.out.println("Aprovado! Parabéns!");
        }

    }
}