import conta.Cheque;
import conta.Cliente;
import conta.ContaCorrente;
import conta.Poupanca;

public class Main {

    public static void main(String[] args) {

        Cliente maria = new Cliente("Maria", "324.456.345-82", "896.678.654-4");

        Cheque cheque1 = new Cheque(300.00, "Bradesco", "10/12/19");

        Poupanca mariaPoupanca = new Poupanca();
        mariaPoupanca.nome(maria);
        mariaPoupanca.setNumero(37278);
        mariaPoupanca.setSaldo(500.00);
        mariaPoupanca.depositar(350);
        mariaPoupanca.sacar(100);
        mariaPoupanca.recolherJuros(0.002);
        mariaPoupanca.consultarSaldo();

        ContaCorrente mariaConta = new ContaCorrente();
        mariaConta.nome(maria);
        mariaConta.setNumero(2389);
        mariaConta.setChequeEspecial(950);
        mariaConta.depositarCheque(cheque1);
        mariaConta.setSaldo(500.80);
        mariaConta.depositar(800);
        mariaConta.sacar(700);
        mariaConta.consultarSaldo();

    }
}
