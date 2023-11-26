package state.exercicio1.state;

import state.exercicio1.Jogo;

public class Esperar implements State{

    private Jogo jogo;
    private String msg = "Esperando";


    public Esperar(Jogo jogo){
       this.jogo = jogo;
    }
    @Override
    public void esperando() {
        System.out.println("Já esperando");
    }
    @Override
    public void correndo() {
        this.jogo.setEstado(new Correr(this.jogo));
    }
    @Override
    public void pulando() {
        this.jogo.setEstado(new Pular(this.jogo));
    }

    @Override
    public String toString() {
        return "Esperar{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
