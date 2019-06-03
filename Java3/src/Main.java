import modelo.Animal;

public class Main {

    public static void main(String[] args) {

        Animal lulu = new Animal("Lulu", 5, "Loreny");
//        lulu.setNomeDoAnimal("Lulu");
//        lulu.setIdade(5);

        System.out.println("Nome: " + lulu.getNomeDoAnimal());
        System.out.println("Idade: " + lulu.getIdade());

        Animal boop = new Animal("Boop", 12, "Loreny");
//        boop.setNomeDoAnimal("Boop");
//        boop.setIdade(12);
//        boop.setDono("Loreny");

        System.out.println("Nome: " + boop.getNomeDoAnimal());
        System.out.println("Idade: " + boop.getIdade());
        System.out.println("Dona: "+ boop.getDono());
    }
}
