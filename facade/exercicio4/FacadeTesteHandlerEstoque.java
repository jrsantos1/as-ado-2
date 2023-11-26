package facade.exercicio4;

public class FacadeTesteHandlerEstoque {
    public void start(){
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto(1, 20.00, "Alimento");
        Produto produto2 = new Produto(2, 20.00, "Alimento");
        Produto produto3 = new Produto(3, 20.00, "Alimento");
        Produto produto4 = new Produto(4, 20.00, "Alimento");

        ItemPedido itemPedido = new ItemPedido(1, produto1);
        ItemPedido itemPedido2 = new ItemPedido(5, produto2);
        ItemPedido itemPedido3 = new ItemPedido(1, produto3);
        ItemPedido itemPedido4 = new ItemPedido(1, produto4);

        Pedido pedido = new Pedido();
        pedido.adicionar(itemPedido2, estoque);
        pedido.adicionar(itemPedido3, estoque);
        pedido.adicionar(itemPedido4, estoque);

        System.out.println();
        System.out.println("Teste remove item");
        estoque.removeItem(produto4);

        System.out.println();
        System.out.println("Exibindo itens estoque");
        estoque.exibirEstoque();
    }
}
