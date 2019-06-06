package conta;

public abstract class Conta{

    private Integer numero;
    private double saldo;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void nome(Cliente titular){
        System.out.println("Titular: " + titular.getNome());
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é " + saldo);
    }

    public abstract void sacar(double saque);

}
