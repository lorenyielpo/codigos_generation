package conta;

public class Poupanca extends Conta {

    public double recolherJuros(double taxaJuros) {
        taxaJuros *= this.getSaldo();
        return taxaJuros;
    }

    @Override
    public void sacar(double saque) {
        super.setSaldo(getSaldo() - saque);
    }

}
