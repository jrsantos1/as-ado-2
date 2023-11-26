package state.exercicio1.state;

import state.exercicio1.Jogo;

public class Pular implements State{

    private Jogo jogo;
    private String msg = "Pulando";

    public Pular(Jogo jogo){
        this.jogo = jogo;
    }

    @Override
    public void esperando() {
        this.jogo.setEstado(new Esperar(this.jogo));
    }
    @Override
    public void correndo() {
        this.jogo.setEstado(new Correr(this.jogo));
    }
    @Override
    public void pulando() {
        System.out.println("Já pulando");
    }

    @Override
    public String toString() {
        return "Pular{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
