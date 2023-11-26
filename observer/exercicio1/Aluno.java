package observer.exercicio1;

import java.util.ArrayList;
import java.util.List;

class Aluno implements Subject{
    private String nome;
    private double p1;
    private double p2;
    private double media;

    private List<Observer> observers = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
        notifyObservers();
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
        notifyObservers();
    }

    private void calcularMedia() {
        this.media = (p1 + p2) / 2;
    }

    // Getters e setters encapsulados
    // ...

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", media=" + media +
                '}';
    }
}
