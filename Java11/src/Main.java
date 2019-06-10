import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Map<String, Integer> mapaNomeIdade = new HashMap<>();
//
//        mapaNomeIdade.put("Pablo", 28);
//        mapaNomeIdade.put("Vitor", 23);
//        mapaNomeIdade.put("Marilia", 25);
//
//        System.out.println(mapaNomeIdade);

//        for(String chave : mapaNomeIdade.keySet()){
//            System.out.println(mapaNomeIdade.get(chave));
//        }
//        List<String> frutas = new ArrayList<>();
//        frutas.add("Morango");
//        frutas.add(1, "Banana");
//
//        System.out.println(frutas);

//        Map<Integer, String> loteriaSonho = new HashMap<>();
//
//        loteriaSonho.put(0, "Ovos");
//        loteriaSonho.put(1, "Água");
//        loteriaSonho.put(2, "Escopeta");
//        loteriaSonho.put(3, "Cavalo");
//        loteriaSonho.put(4, "Dentista");
//        loteriaSonho.put(5, "Fogo");
//
//        System.out.println(loteriaSonho);
//
//        Map<String, List<String>> apelidos = new HashMap<>();
//        List<String> apelidoJoao = new ArrayList<>();
//        apelidoJoao.add("Juan");
//        apelidoJoao.add("Fissura");
//        apelidoJoao.add("Maromba");
//        apelidos.put("João", apelidoJoao);
//
//
//        List<String> apelidoMiguel = new ArrayList<>();
//        apelidoMiguel.add("Night Watch");
//        apelidoMiguel.add("Bruce Wayne");
//        apelidoMiguel.add("Tampinha");
//        apelidos.put("Miguel", apelidoMiguel);
//
//        List<String> apelidoMaria = new ArrayList<>();
//        apelidoMaria.add("Wonder Woman");
//        apelidoMaria.add("Mary");
//        apelidoMaria.add("Marilene");
//        apelidos.put("Maria", apelidoMaria);
//
//        List<String> apelidoLucas= new ArrayList<>();
//        apelidoLucas.add("Lukinha");
//        apelidoLucas.add("Jorge");
//        apelidoLucas.add("George");
//        apelidos.put("Lucas", apelidoLucas);
//
//        System.out.println(apelidos);


//        Set<Integer> numerosConjunto = new HashSet<>();
//        numerosConjunto.add(1);
//        numerosConjunto.add(5);
//        numerosConjunto.add(5);
//        numerosConjunto.add(6);
//        numerosConjunto.add(7);
//        numerosConjunto.add(8);
//        numerosConjunto.add(8);
//        numerosConjunto.add(8);
//
//        for (Integer numeroConjunto : numerosConjunto){
//            System.out.println(numeroConjunto);
//        }
//
//        List<Integer> numeros = new ArrayList<>();
//        numerosConjunto.add(1);
//        numerosConjunto.add(5);
//        numerosConjunto.add(5);
//        numerosConjunto.add(6);
//        numerosConjunto.add(7);
//        numerosConjunto.add(8);
//        numerosConjunto.add(8);
//        numerosConjunto.add(8);
//
//        for (Integer numero : numerosConjunto){
//            System.out.println(numero);
//        }


//        Prova numerosLista = new Prova();
//        Set<Integer> conjuntoDeInteiros = new HashSet<>();
//        conjuntoDeInteiros.add(5);
//        conjuntoDeInteiros.add(4);
//        conjuntoDeInteiros.add(7);
//        numerosLista.somaTotal(conjuntoDeInteiros);


        GuardaVolumes peca1 = new GuardaVolumes();
        Map<Integer, List<String>> dicionario = new HashMap<>();

        peca1.setMarca("nike");
        peca1.setModelo("nova");
        peca1.contador = 1;

        List<String> listaPecas = new ArrayList<>();
        listaPecas.add(peca1.getMarca());
        listaPecas.add(peca1.getModelo());
        peca1.guardaPecas(listaPecas, dicionario);

        peca1.mostrarPecas(dicionario);

        GuardaVolumes peca2 = new GuardaVolumes();
        peca2.setMarca("ADIDAS");
        peca2.setModelo("velha");
        peca2.contador = 2;

        List<String> listaPeca1 = new ArrayList<>();
        listaPeca1.add(peca2.getMarca());
        listaPeca1.add(peca2.getModelo());

        peca2.guardaPecas(listaPeca1, dicionario);
        peca2.mostrarPecas(dicionario);

        peca2.devolverPeca(2, dicionario);

    }
}
