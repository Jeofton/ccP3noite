public class Conta {
    private double saldo = 0;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void pegarSaldo(){
        System.out.println("O saldo é R$: "+ this.saldo);
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
}
