package facade.exercicio3.facade;

import facade.exercicio3.composite.Component;
import facade.exercicio3.composite.Composite;
import facade.exercicio3.composite.Leaf;

public class CestaFacade {
    public Composite criarCestaComposite() {
        Component produto1 = new Leaf(12.56, "café");
        Component produto2 = new Leaf(10.26, "leite");
        Component produto3 = new Leaf(6.12, "pão de queijo");

        Component caixaDeBombom = criarCaixaDeBombom();
        Composite cesta = new Composite("Cesta de café");
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        cesta.adicionar(caixaDeBombom);

        return cesta;
    }

    private Composite criarCaixaDeBombom() {
        Component produto5 = new Leaf(9.78, "bombom licor");
        Component produto6 = new Leaf(8.23, "bombom cereja");
        Composite caixa = new Composite("Caixa de bombom");
        caixa.adicionar(produto5);
        caixa.adicionar(produto6);

        return caixa;
    }
}
