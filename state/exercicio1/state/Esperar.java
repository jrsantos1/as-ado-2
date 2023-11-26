package state.exercicio1.state;

import state.exercicio1.Jogo;

public class Esperar implements State{

    private Jogo jogo;
    private String msg = "Correndo";


    public Esperar(Jogo jogo){
       this.jogo = jogo;
    }
    @Override
    public void esperando() {

    }
    @Override
    public void correndo() {

    }
    @Override
    public void pulando() {

    }
}
