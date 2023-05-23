public class Algoritmos extends Disciplina{
    private double nota3;

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double media(){
        double media = ((super.getNota1()+super.getNota2()+this.nota3)/3);
        return media;
    }
}
