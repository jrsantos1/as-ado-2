package observer.exercicio1;

class Diretor implements Observer {
    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Aluno aluno) {
        System.out.println("Diretor " + nome + " notificado. " + aluno);
    }
}