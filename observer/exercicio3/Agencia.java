package observer.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Observer> subscribers = new ArrayList<>();

    public void inscrever(Observer subscriber) {
        subscribers.add(subscriber);
    }

    public void remover(Observer subscriber) {
        subscribers.remove(subscriber);
    }

    public void notificar(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.atualizar(message);
        }
    }
}
