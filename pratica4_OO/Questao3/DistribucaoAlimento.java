package pratica4_OO.Questao3;

public class DistribucaoAlimento extends Projeto {

    private String descAlimento;
    private float qtce;

    public DistribucaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtce) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtce = qtce;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtce() {
        return qtce;
    }

    public void setQtce(float qtce) {
        this.qtce = qtce;
    }

    @Override
    public boolean validaProjeto() {
        if (getDataFim().equals(null)) {
            return true;
        }
        return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do projeto:  " +getNomeProjeto()+
                "Descrição: " + getDescAlimento() + '\n' +
                "Data de início" + getDataInicio() + " \n" +
                "Data do fim : " + getDataFim() + " \n " +
                "Quantidade: " + getQtce();
    }
}
