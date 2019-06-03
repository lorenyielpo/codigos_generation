public class Main {

    public static void main(String[] args) {
        JogadorDeFutebol joao = new JogadorDeFutebol();
        joao.nome = "João";
        joao.energia = 30;
        joao.alegria = 50;
        joao.gols = 22;
        joao.experiencia = 53;
        joao.fazerGol();
        joao.correr();

        SessaoDeTreinamento treino1 = new SessaoDeTreinamento();
        treino1.jogador = joao;
        treino1.treinarA();
        treino1.experiencia();
    }

}
