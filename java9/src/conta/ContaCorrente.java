package conta;

public class ContaCorrente extends Conta {

    private double chequeEspecial;

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void depositarCheque(Cheque chequeDeposito){
        super.setSaldo(chequeDeposito.getValorCheque());
    }

    @Override
    public void sacar(double saque) {

        if (saque <= getSaldo() + chequeEspecial) {
            super.setSaldo(getSaldo() - saque);
        } else {
            super.setSaldo(getSaldo() - saque);
        }
    }
}
