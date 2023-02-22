package entities;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double NotaFinal(){
        return nota1 + nota2 + nota3;
    }
    public double PontoFaltante(){
        if (NotaFinal()<60.0){
            return  60.0 - NotaFinal();
        }
        else {
            return 0.0;
        }
    }
}
