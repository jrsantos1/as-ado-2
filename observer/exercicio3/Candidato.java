package observer.exercicio3;

class Candidato implements Observer {
    private String name;

    public Candidato(String name) {
        this.name = name;
    }

    @Override
    public void atualizar(String message) {
        System.out.println(name + " recebeu a seguinte mensagem: " + message);
    }
}