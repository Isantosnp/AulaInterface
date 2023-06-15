package pratica4_OO.Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = 0;
        Conta cp = new ContaPoupanca(saldo);
        System.out.println("Saldo:");
        saldo = teclado.nextDouble();
        cp.setSaldo(saldo);
        cp.getSaldo();
        cp.imprimeExtrato();
    }
}
