package Model;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public float getLimite(){
        return limite;
    }

    public void setLimite(float limite){
        if (limite >= 0){
            this.limite = limite;
        } else {
            this.limite = 0;
        }
    }

    @Override
    public void sacar(float valor){
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque bem sucedido!\nR$"+ valor + "\nSeu novo saldo será de R$"+ getSaldo());
        } else if (valor <= getSaldo() + limite){
            limite = limite + (getSaldo() - valor);
            setSaldo(0);
            System.out.println("Você entrou no cheque especial, e está agora com um limite de R$"+limite);
        } else{
            System.out.println("Seu saldo de R$"+getSaldo()+" e limite de R$"+limite+" são insuficientes para completar essa transação.");
        }
    }
}
