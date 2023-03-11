public class ContaBancaria{
    public String cpf;
    public String nome;
    public double saldo;
    public double obtemsaldo(){
        return saldo;
    }
    public void saque( double valor){
        if(saldo>=valor){
            saldo=saldo-valor;
        }
    }
    public void deposito(double valor){
        saldo=saldo+valor;
    }
}