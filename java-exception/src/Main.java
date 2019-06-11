import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        try{
//        Pessoa pessoa = new Pessoa();
//
//        if(pessoa.getIdade() >= 18){
//            System.out.println("Você é maior de idade");
//            System.out.println(pessoa.getIdade());
//        }
//        } catch (NullPointerException e){
//            System.out.println("Caiu dentro do catch");
//        }
//
//        System.out.println("Esse é o fim do programa");
//
//        try{
//            Integer i = 0;
//
//            if(18/i == 18){
//                System.out.println("Nunca vai entrar aqui");
//            }
//        } catch (ArithmeticException e){
//            System.out.println("Caiu dentro do catch");
//        }

        try{
            List<String> novaLista = new ArrayList<>();
            novaLista.add("Pato");
            novaLista.add("Cachorro");
            novaLista.add("Gato");

            System.out.println(novaLista.get(3));
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Não exite nada no indice 3");
        }


        try{
//            List<String> novaLista = new ArrayList<>(null);
            List<String> novaLista = new ArrayList<>();
            novaLista.add("Pato");
            novaLista.add("Cachorro");
            novaLista.add("Gato");

//            System.out.println(novaLista.get(2));
            System.out.println(novaLista.get(5));
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Lista iniciada com null");
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Não existe indice 5");
        }


    }
}
