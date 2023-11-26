package observer.exercicio2.observer;


import java.util.Objects;

public class NaveInimiga implements Observer {
    private String nome;

    public NaveInimiga(String nome,Subject subj) {
        this.nome = nome;
        subj.adicionarObservadores(this);
    }

    public NaveInimiga(String nome){
        this.nome = nome;
    }
     
    @Override
    public void atualizar(Acao acao) {
        System.out.println(this.nome+" "+acao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NaveInimiga that = (NaveInimiga) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
