import model.Departamento;
import model.Empresa;
import model.Funcionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        int numero = 87;
//        int sucessor= numero+1;
//        int antecessor = numero-1;


//        System.out.println("numero: "+ numero + " seu sucessor é: "+ sucessor);
//        System.out.println("numero: "+ numero + " seu antecessor é: "+ antecessor);


//        Map<String, Integer> idades = new HashMap<>();
//        idades.put("Olivia", 20);
//        idades.put("Leonardo", 23);
//        idades.put("Vicente", 22);
//
//        int menor = 100;
//        int maior = 0;
//
//           for (String chave : idades.keySet()){
//                if(idades.get(chave) < menor){
//                    menor = idades.get(chave);
//                    System.out.println(menor);
//                } else if( idades.get(chave) > maior){
//                    maior = idades.get(chave);
//                    System.out.println(maior);
//                }
//        }



//        NumeroDescrescente numeroNovo = new NumeroDescrescente();
//        numeroNovo.decrescer(10);


        List<Funcionario> contabilidadeFuncionario = new ArrayList<>();
        List<Funcionario> admFuncionario = new ArrayList<>();

        Departamento contabilidade = new Departamento("contabilidade");
        Departamento administracao = new Departamento("administração");

        Map<String, List<Funcionario>> departamentos = new HashMap<>();

        Funcionario ana = new Funcionario("Ana", "10/12", 3000.34);
        Funcionario julia = new Funcionario("Julia", "7/1", 2100.50);
        Funcionario carlos = new Funcionario("Carlos", "7/8", 1500.50);
        Empresa novaEmpresa = new Empresa("Aleluia", "321.231.231/0001-41");

        contabilidade.lista(contabilidadeFuncionario, ana);

        administracao.lista(admFuncionario, julia);
        administracao.lista(admFuncionario, carlos);

        novaEmpresa.departamentoLista(contabilidade, departamentos, contabilidadeFuncionario);
        novaEmpresa.departamentoLista(administracao, departamentos, admFuncionario);

        novaEmpresa.departamentoTransferir(admFuncionario, contabilidadeFuncionario, carlos);
        System.out.println(departamentos);

//        novaEmpresa.aumentar(departamentos);

    }

}
