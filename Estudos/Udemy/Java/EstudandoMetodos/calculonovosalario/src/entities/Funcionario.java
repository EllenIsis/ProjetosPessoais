package entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double taxa;
    public double SalarioLiquido(){
        return salario - taxa;
    }
    public void IncrementoSalario(double percentual){
        salario += salario * (percentual/100);
    }
    public String toString(){
        return nome + " o valor do salário é $" + String.format("%.2f", SalarioLiquido()) + ".";
    }
}
