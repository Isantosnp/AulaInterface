package Interface;

public class Main {

        public static void main(String[] args){
            Funcionario f = new Funcionario();
            f.setNome("Isabella");
            f.setCPF("123");
            f.setComissao(100);
            f.setSalario(400);
            System.out.println(f.getPagamento());
        }
    }
