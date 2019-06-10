import java.util.HashSet;
import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        int soma = 0;
        for(Integer numero: conjuntoDeInteiros){
            soma = soma + numero;

            System.out.println(soma);
        }
    }

}
