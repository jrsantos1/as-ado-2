package observer.exercicio1;

public class Cliente {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");

        Professor professor1 = new Professor("Professor A");
        Professor professor2 = new Professor("Professor B");
        Diretor diretor1 = new Diretor("Diretor A");
        Diretor diretor2 = new Diretor("Diretor B");
        Coordenador coordenador1 = new Coordenador("Coordenador A");
        Coordenador coordenador2 = new Coordenador("Coordenador B");

        aluno.subscribe(professor1);
        aluno.subscribe(professor2);
        aluno.subscribe(diretor1);
        aluno.subscribe(diretor2);
        aluno.subscribe(coordenador1);
        aluno.subscribe(coordenador2);

        aluno.setP1(7.5);
        aluno.setP2(8.0);
    }
}
