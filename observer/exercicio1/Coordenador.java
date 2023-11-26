package observer.exercicio1;

class Coordenador implements Observer {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Aluno aluno) {
        System.out.println("Coordenador " + nome + " notificado. " + aluno);
    }
}