package observer.exercicio1;

interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
