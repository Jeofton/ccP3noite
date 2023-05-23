import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Programador programador = new Programador();
        System.out.println("Qual o nome do projeto:");
        gerente.setProjeto(sc.nextLine());
        System.out.println("Qual a linguagem:");
        programador.setLingagem(sc.nextLine());

        programador.InformarLinguagem();
        gerente.InformarProjeto();
        System.out.println("Digite o nome do programador");
        programador.setNome(sc.nextLine());
        String mens = String.format("O analista %s desenvolve na linguagem %s.", programador.getNome(), programador.getLingagem());

        System.out.println(mens);
    }
}