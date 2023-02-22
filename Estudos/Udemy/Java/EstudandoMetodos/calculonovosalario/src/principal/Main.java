package principal;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Qual o nome do funcionario: ");
        funcionario.nome = scanner.nextLine();
        System.out.println("Qual o seu salário: ");
        funcionario.salario = scanner.nextDouble();
        System.out.println("Qual o valor da taxa: ");
        funcionario.taxa = scanner.nextDouble();

        System.out.println();
        System.out.println(funcionario);

        System.out.println("Qual a porcentagem: ");
        double porcentagem = scanner.nextDouble();
        funcionario.IncrementoSalario(porcentagem);

        System.out.println();
        System.out.println("Depois do aumento do salário: " + funcionario);
        scanner.close();


    }
}