package Model;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public void sacar(float valor){
        if (valor <= getSaldo()){
            float novoSaldo = getSaldo() - valor;
            System.out.println("Saque efetivado!\nO novo saldo é: R$"+ novoSaldo);
            setSaldo(novoSaldo);
        }
        else {
            System.out.println("saldo insuficiente!\nSeu saldo atual é de : R$"+getSaldo());
        }
    }
    
    public void depositar(int valor){
        setSaldo(getSaldo() + valor);
    }
}
