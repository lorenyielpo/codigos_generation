package model;

import java.util.List;
import java.util.Map;

public class Empresa {
    private String nomeEmpresa;
    private String cnpj;
    private Departamento departamento;
    private Funcionario nomeFuncionario;

    public void departamentoLista(Departamento departamento, Map<String, List<Funcionario>> listaDepartamento, List<Funcionario> listafuncionario){
        listaDepartamento.put(departamento.getNomeDepartamento(), listafuncionario);
        System.out.println(listaDepartamento);
    }

    public void departamentoTransferir(List<Funcionario> departamentoAntigo, List<Funcionario> departamentoNovo, Funcionario funcionario){
        departamentoAntigo.remove(funcionario);
        departamentoNovo.add(funcionario);
        System.out.println("O funcionário "+ funcionario.getNome());
    }

    public void aumentar(Map<String, List<String>> listaDepartamento){
        for (String chave :listaDepartamento.keySet()){
            List valor = listaDepartamento.get(chave);

            System.out.println(valor);
        }
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(String nomeEmpresa, String cnpj) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }
}
