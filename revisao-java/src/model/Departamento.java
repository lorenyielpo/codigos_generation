package model;

import java.util.List;
import java.util.Map;

public class Departamento {
    private String departamento;

    public Departamento(String departamento) {
    }

    public void lista(List<Funcionario> listaFuncionarios, Funcionario funcionario){
        listaFuncionarios.add(funcionario);
        System.out.println(listaFuncionarios);
    }

    public String getNomeDepartamento() {
        return departamento;
    }

    public void setNomeDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
