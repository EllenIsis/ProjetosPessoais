package entities;

public class Retangulo {
    public double altura;
    public double largura;
    public double Area(){
        return largura * altura;
    }
    public double Perimetro(){
        return 2*(largura +altura);
    }
    public double Diagonal(){
        return Math.pow(altura, 2) + Math.pow(largura, 2) ;
    }
}
