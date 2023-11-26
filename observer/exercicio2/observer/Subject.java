

package observer.exercicio2.observer;


/*
 *  Professor Gerson Risso
 *
 */
public interface Subject {
  public void adicionarObservadores(Observer observer);
  public void notificar();
  public void setAcao(Acao acao);

  public void removeObserver(Observer observer);


}
