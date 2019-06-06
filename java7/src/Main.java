public class Main {

    public static void main(String[] args) {
        Cachorro lulu = new Cachorro(true);

        lulu.latir();

        lulu.setEspecie("Cachorro");
        lulu.setIdade(3);
        lulu.setSexo('F');
        lulu.ehMamifero();

        System.out.println(lulu.getEspecie());


    }
}
