public class Matematica extends Disciplina{
    private double nota3;
    private double nota4;

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double media(){
        return ((super.getNota1()+super.getNota2()+this.nota3+this.nota4)/4);
    }
}
