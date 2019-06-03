package modelo;

public class Animal {
    private String nomeDoAnimal;
    private int idade;
    private String dono;

    public boolean animalEhMamifero(){
        return true;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Animal (){

    }

    public Animal (String nomeDoAnimal, int idade, String dono){
        this.nomeDoAnimal = nomeDoAnimal;
        this.idade = idade;
        this.dono = dono;
    }
}
