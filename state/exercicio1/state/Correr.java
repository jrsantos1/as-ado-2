package state.exercicio1.state;

import state.exercicio1.Jogo;

public class Correr implements State{

    private Jogo jogo;
    private String msg = "Correndo";

    public Correr(Jogo jogo){
        this.jogo = jogo;
    }

    @Override
    public void esperando() {
        System.out.println("Já correndo!");
    }
    @Override
    public void correndo() {
        System.out.println("Já Correndo!");
    }
    @Override
    public void pulando() {
        this.jogo.setEstado(new Pular(this.jogo));
    }

    @Override
    public String toString() {
        return "Correr{" +
                "jogo=" + jogo +
                ", msg='" + msg + '\'' +
                '}';
    }
}
