package state.exercicio1;

import state.exercicio1.state.Correr;
import state.exercicio1.state.Esperar;
import state.exercicio1.state.Pular;
import state.exercicio1.state.State;

public class Jogo {
    private State estado;

    public Jogo(){
        this.estado = new Esperar(this);
    }
    public State getEstado() {
        return estado;
    }
    public void setEstado(State estado) {
        this.estado = estado;
    }

    public void correr(){
        this.estado.correndo();
    }

    public void pular(){
        this.estado.pulando();
    }

    public void esperar(){
        this.estado.esperando();
    }


}
