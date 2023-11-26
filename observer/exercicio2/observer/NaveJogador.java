package observer.exercicio2.observer;

/*
 *  Professor Gerson Risso
 */


import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NaveJogador implements Subject{
    private String nome;
    private Acao acao;
    private List<Observer> lista;
    private static NaveJogador instance;

    private NaveJogador(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    // Método estático para obter a instância única
    public static NaveJogador getInstance(String nome) {
        if (instance == null) {
            instance = new NaveJogador(nome);
        }
        return instance;
    }
    
    @Override
    public void adicionarObservadores(Observer observer) {
      lista.add(observer);
    }

    @Override
    public void notificar() {
        for(Observer obs:lista){
          obs.atualizar(acao);
        }
    }

    @Override
    public void setAcao(Acao acao) {
        this.acao=acao;
        notificar();
    }

    @Override
    public void removeObserver(Observer observer) {
        this.lista.remove(observer);
    }

    public void moverNaveAleatoriamente() {
        Random random = new Random();
        int novaPosicao = random.nextInt(3);
        ArrayList<Acao> acoes = new ArrayList<>();
        acoes.add(Acao.AVANCAR);
        acoes.add(Acao.RECUAR);
        acoes.add(Acao.VIRAR_ESQ);
        acoes.add(Acao.VIRAR_DIR);
        setAcao(acoes.get(novaPosicao));
    }

}
