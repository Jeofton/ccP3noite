public class ContaCorrente extends Conta{
    public void deposita(double valor){
        double saldo = super.getSaldo();
        double novoSaldo = saldo + valor - 0.10;
        super.setSaldo(novoSaldo);
    }
}
