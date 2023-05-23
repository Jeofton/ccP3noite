public class Main {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca();
        poupanca.deposita(500);
        poupanca.pegarSaldo();

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        cc.pegarSaldo();
        System.out.println("Programa encerrado");
    }
}