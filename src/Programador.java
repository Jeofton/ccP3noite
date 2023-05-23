public class Programador extends  Funcionarios{
    private String linguagem;

    public String getLingagem() {
        return linguagem;
    }

    public void setLingagem(String lingagem) {
        this.linguagem = lingagem;
    }


    public void InformarLinguagem() {
        System.out.println("A linguagem é "+getLingagem());;
    }
}
