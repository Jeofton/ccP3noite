public class Main {
    public static void main(String[] args) {
        Algoritmos a = new Algoritmos();
        a.setCodigo(001);
        a.setNota1(8);
        a.setNota2(7);
        a.setNota3(6);
        System.out.println("A média em Algoristmos é: "+ a.media());
        System.out.println("*_*_*_*_*_*_*_*_*_*");
        Matematica m = new Matematica();
        m.setCodigo(002);
        m.setNota1(5);
        m.setNota2(10);
        m.setNota3(8);
        m.setNota4(7);
        System.out.println("A média em Matemática é: "+m.media());
    }
}