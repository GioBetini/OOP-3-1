package View;

import Model.ContaBancaria;
import Model.ContaEspecial;
import Model.ContaPoupança;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setCliente("Giovani");
        contaSimples.setNumConta(1);
        contaSimples.setSaldo(0);

        ContaPoupança contaP = new ContaPoupança();
        contaP.setCliente("Luiz");
        contaP.setNumConta(2);
        contaP.setSaldo(0);

        ContaEspecial contaE = new ContaEspecial();
        contaE.setCliente("Andrey");
        contaE.setNumConta(3);
        contaE.setSaldo(0);
        contaE.setLimite(100);

        contaSimples.depositar(500);
        contaP.depositar(100);
        contaE.depositar(200);

        contaSimples.sacar(100);
        contaSimples.sacar(500); //retorna o devido aviso de saldo insuficiente

        contaE.sacar(250); 
        contaE.sacar(330);

        contaP.calcularRendimento(10);

        System.out.println(contaSimples.getCliente());
        System.out.println(contaE.getLimite());
        System.out.println(contaE.getNumConta());
        System.out.println(contaP.getSaldo());
    }
}
