package observer.exercicio2.cliente;

/*
*  Professor Gerson Risso
*/

import observer.exercicio2.observer.Observer;
import observer.exercicio2.observer.Acao;
import observer.exercicio2.observer.NaveInimiga;
import observer.exercicio2.observer.NaveJogador;
import observer.exercicio2.observer.Subject;

public class Jogo {
 
    public static void main(String[] args) {
      NaveJogador naveJ = NaveJogador.getInstance("Gerson");
      Observer naveI1=new NaveInimiga("Nave Inimiga 1", naveJ);
      Observer naveI2 = new NaveInimiga("Nave Inimiga 2");

      naveJ.adicionarObservadores(naveI2);

      naveJ.setAcao(Acao.AVANCAR);
      naveJ.setAcao(Acao.RECUAR);
      naveJ.setAcao(Acao.VIRAR_DIR);
      naveJ.setAcao(Acao.AVANCAR);

      naveJ.removeObserver(naveI1);

      naveJ.moverNaveAleatoriamente();

    }

}
