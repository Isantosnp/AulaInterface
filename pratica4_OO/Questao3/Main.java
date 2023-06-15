package pratica4_OO.Questao3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String nomeProjeto, descricao, endereco, dataInicio, dataFim, descAlimento, tipoTrabalho;
        int qtde, duracaoTrabalho;



        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o projeto que você deseja :\n <1> Cadastrar Projeto Distribuir Alimentos \n <2> Cadastrar Projeto Trabalho Voluntário", "Projeto Social", JOptionPane.INFORMATION_MESSAGE));
        switch (opcao) {
            case 1:
                nomeProjeto = JOptionPane.showInputDialog(null, "Nome Projeto de distribuição : ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                descricao = JOptionPane.showInputDialog(null, "Descrição do  Projeto: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                endereco = JOptionPane.showInputDialog(null, "Endereço: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                dataInicio = JOptionPane.showInputDialog(null, "Data Inicio: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                dataFim = JOptionPane.showInputDialog(null, "Data Fim: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                descAlimento = JOptionPane.showInputDialog(null, "Descição do alimento: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do alimento : \n (Insira somente números) ", "Projeto Social", JOptionPane.QUESTION_MESSAGE));

                DistribucaoAlimento db = new DistribucaoAlimento(nomeProjeto, descricao, endereco, dataInicio, dataFim, descAlimento, qtde);
                db.setNomeProjeto(nomeProjeto);
                db.setDescricao(descricao);
                db.setEndereco(endereco);
                db.setDataInicio(dataInicio);
                db.setDataFim(dataFim);
                db.setDescAlimento(descAlimento);
                db.setQtce(qtde);

                JOptionPane.showMessageDialog(null, "DISTRIBUIÇÃO DO ALIMENTO \n\n\n Nome projeto: "+db.getNomeProjeto()+"\n Descrição de projeto: " + db.getDescricao()+ "\n Endereço: " + db.getEndereco()+ "\n Data de início: "+ db.getDataInicio()+
                        "Data do fim do projeto: " + db.getDataFim()+ "\n Descrição do alimento: "+ db.getDescAlimento()+ "\n QUantidade: "+ db.getQtce(), "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:

                nomeProjeto = JOptionPane.showInputDialog(null, "Nome Projeto de trabalho: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                descricao = JOptionPane.showInputDialog(null, "Descrição: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                endereco = JOptionPane.showInputDialog(null, "Endereço: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                dataInicio = JOptionPane.showInputDialog(null, "Data Inicio: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                dataFim = JOptionPane.showInputDialog(null, "Data Fim: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                tipoTrabalho = JOptionPane.showInputDialog(null, "Tipo de trabalho: ", "Projeto Social", JOptionPane.QUESTION_MESSAGE);
                duracaoTrabalho = Integer.parseInt(JOptionPane.showInputDialog(null, "Duração do trabalho: \n (Insira somente números) \n (Escreva somente a minutagem)", "Projeto Social", JOptionPane.QUESTION_MESSAGE));

                TrabalhoVoluntario tv = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, dataInicio, dataFim, tipoTrabalho, duracaoTrabalho);
                tv.setNomeProjeto(nomeProjeto);
                tv.setDescricao(descricao);
                tv.setEndereco(endereco);
                tv.setDataInicio(dataInicio);
                tv.setDataFim(dataFim);
                JOptionPane.showMessageDialog(null, "TRABALHO VOLUNTÀRIO \n\n\n Nome projeto: "+tv.getNomeProjeto()+"\n Descrição de projeto: " + tv.getDescricao()+ "\n Endereço: " + tv.getEndereco()+ "\n Data de início: "+ tv.getDataInicio()+
                        "Data do fim do projeto: " + tv.getDataFim()+ "\n Tipo de trabalho : "+ tv.getTipoTrabalho()+ "\n Duração do trabalho: "+ tv.getDuracaoTrabalho(), "Projeto Social", JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                break;
        }
    }
}
