public class Conta {
    public int numberCount;
    private double saldo;
    private double novoSaldo;
    public double deposito;
    public double saque;
    private Cliente titular;

    public Cliente getTitular(){
        return titular;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getNovoSaldo(){
        this.novoSaldo = getSaldo() + getDeposito();
        return novoSaldo;
    }

    public void setNovoSaldo(double novoSaldo){
        this.novoSaldo = getSaldo() + getDeposito();
    }

    public void sacar(){
            if(novoSaldo < 0){
                System.out.println("Saldo Insuficiente");
        } else {
                this.novoSaldo = (novoSaldo - saque);
           System.out.println("O novo saldo é: " + this.novoSaldo);
        }

    }
}
