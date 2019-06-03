public class JogadorDeFutebol {

    public String nome;
    public int energia;
    public int alegria;
    public int gols;
    public int experiencia;

    public void fazerGol(){
        this.energia -= 5;
        this.alegria += 10;
        this.gols += 1;
        System.out.println("GOOOOOLLLL");
    }

    public void correr(){
        this.energia = (energia - 10);
        System.out.println("Cansei");
    }

}
