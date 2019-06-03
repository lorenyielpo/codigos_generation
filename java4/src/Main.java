public class Main {

    public static void main(String[] args) {
        Cliente maria = new Cliente();
        maria.setNome("Maria");
        maria.setSobrenome("Sousa");

        System.out.println("Nome: " + maria.getNome());
        System.out.println("Sobrenome: " + maria.getSobrenome());

        Conta contaMaria = new Conta();
        contaMaria.numberCount = 01023;
        contaMaria.setTitular(maria);
        System.out.println("Titular é: " + contaMaria.getTitular());
        contaMaria.setSaldo(300.00);
        System.out.println("O saldo é: "+ contaMaria.getSaldo());
        contaMaria.setDeposito(500.00);
        System.out.println("O depósito é: " + contaMaria.getDeposito());
        System.out.println("O novo saldo da Maria é: " + contaMaria.getNovoSaldo());
        contaMaria.saque = 300.00;
        contaMaria.sacar();


        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        carlos.setSobrenome("Silva");

        System.out.println("Nome: " + carlos.getNome());
        System.out.println("Sobrenome: " + carlos.getSobrenome());

        Conta contaCarlos = new Conta();
        contaCarlos.numberCount = 01201;
        contaCarlos.setTitular(carlos);
        System.out.println("Titular é: " + contaCarlos.getTitular());
        contaCarlos.setSaldo(800.00);
        System.out.println("O saldo é: "+ contaCarlos.getSaldo());
        contaCarlos.setDeposito(600.00);
        System.out.println("O depósito é: " + contaCarlos.getDeposito());
        System.out.println("O novo saldo da Maria é: " + contaCarlos.getNovoSaldo());
        contaCarlos.saque = 200.00;
        contaCarlos.sacar();
    }
}
