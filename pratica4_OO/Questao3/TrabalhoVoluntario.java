package pratica4_OO.Questao3;

public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto() {
        if (getDuracaoTrabalho() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome do projeto:  " +getNomeProjeto()+
                "Descrição: " + getDescricao() + '\n' +
                "Data de início" + getDataInicio() + " \n" +
                "Data do fim : " + getDataFim() + " \n " +
                "Tipo de trabalho: " +getTipoTrabalho()+ " \n "+
                "Duração  do trabalho " +getDuracaoTrabalho();

    }
}
