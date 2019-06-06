package conta;

public class Cheque {
    private double valorCheque;
    private String banco;
    private String data;

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cheque(double valorCheque, String banco, String data) {
        this.valorCheque = valorCheque;
        this.banco = banco;
        this.data = data;
    }

    public Cheque(){

    }
}
