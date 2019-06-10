import java.util.*;

public class GuardaVolumes extends Peca{

    public Integer contador;
    public Peca peca;
    public Map<Integer, List<String>> dicionario;


    public Integer guardaPecas(List<String> listaPeca, Map<Integer, List<String>> dicionario){
        dicionario.put(contador, listaPeca);
        return contador;
    }

    public void mostrarPecas(Map<Integer, List<String>> dicionario){
        System.out.println(dicionario);
    }


    public void devolverPeca(Integer numero, Map<Integer, List<String>> dicionario){
        dicionario.remove(numero);
        System.out.println(dicionario);
    }

    @Override
    public void retirada() {
        System.out.println(1);
    }

}
