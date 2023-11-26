package facade.exercicio3.cliente;

import facade.exercicio3.composite.Component;
import facade.exercicio3.composite.Composite;
import facade.exercicio3.composite.Leaf;
import facade.exercicio3.facade.CestaFacade;

public class UsaCesta {
 
    public static void main(String[] args) {

      CestaFacade cestaFacade = new CestaFacade();
      Composite cesta = cestaFacade.criarCestaComposite();

      System.out.println(cesta);
      System.out.println("Total: "+cesta.getPreco());
    }

}
