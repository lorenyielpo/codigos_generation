import classes.Gerente;

public class Main {

    public static void main(String[] args) {
        Gerente maria = new Gerente();
        maria.setNome("Maria");
        maria.calcularSalario();
        System.out.println(maria.getNome());
        System.out.println(maria);

        Gerente joao = new Gerente();
        joao.setNome("João");
        joao.calcularSalario();
        System.out.println(joao.getNome());
        System.out.println(joao);

        System.out.println(maria.equals(joao));

    }
}
