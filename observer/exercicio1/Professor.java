package observer.exercicio1;

class Professor implements Observer {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Aluno aluno) {
        System.out.println("Professor " + nome + " notificado. " + aluno);
    }
}