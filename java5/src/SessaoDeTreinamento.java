public class SessaoDeTreinamento {
    public JogadorDeFutebol jogador;


    public void treinarA(){

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        System.out.println(jogador.experiencia);
    }

    public void experiencia(){
        jogador.experiencia += 1;
        System.out.println(jogador.experiencia);
    }
}
