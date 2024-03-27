package Model;

public class ContaPoupança extends ContaBancaria {
    private int diaDeRendimento;
    
    
    public void calcularRendimento(float taxa){
       float saldo = getSaldo() * (1+(taxa/100));
       setSaldo(saldo);
       System.out.println("O saldo após o dia de rendimento é: R$ " + getSaldo());

    }
}
