public class Main {

    public static void main(String[] args) {

        Atleta lucia = new Atleta();
        lucia.nome = "Lucia";
        lucia.energia = 80;
        lucia.nivel = 12;

        Prova provaA = new Prova();
        provaA.participante = lucia;
        provaA.energiaNecessaria = 60;
        provaA.dificuldade = 13;
        provaA.podeRealizar();
    }
}
