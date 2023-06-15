package pratica4_OO.Questao2;

public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaOperacao = 0.45;

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOperacao;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor + taxaOperacao;
    }
}
