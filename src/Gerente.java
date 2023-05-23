public class Gerente extends  Funcionarios{
    private String projeto;

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void InformarProjeto(){
        System.out.println("O projeot é "+getProjeto());
    }

}
