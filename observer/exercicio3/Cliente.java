package observer.exercicio3;

public class Cliente {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        Candidato subscriber1 = new Candidato("Jhonatan");
        Candidato subscriber2 = new Candidato("Matheus");
        Candidato subscriber3 = new Candidato("Ronald");

        agencia.inscrever(subscriber1);
        agencia.inscrever(subscriber2);
        agencia.inscrever(subscriber3);

        agencia.notificar("Nova vaga de Desenvolvedor Java disponível!");
        agencia.remover(subscriber2);
        agencia.notificar("Nova vaga de QA Engineer disponível!");
    }
}
