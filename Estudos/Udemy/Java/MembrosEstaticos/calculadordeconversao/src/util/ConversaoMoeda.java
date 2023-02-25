package util;

public class ConversaoMoeda {
    public static double IOF = 0.06;
    public static double dolarParaReal(double valor, double cotacaoDolar) {
        return valor * cotacaoDolar * (1.0 + IOF);
    }
}
