package state.exercicio1;

public class Jogar {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.esperar();
        jogo.correr();
        System.out.println(jogo.getEstado());
        jogo.esperar();
        System.out.println(jogo.getEstado());
        jogo.pular();
        jogo.pular();
        System.out.println(jogo.getEstado());


    }
}
