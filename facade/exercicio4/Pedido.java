package facade.exercicio4;

import java.util.List;

public class Pedido {
    private Double valor;
    private List<ItemPedido> itemPedidos;

    public void adicionar(ItemPedido itemPedido, Estoque estoque){
        try{
            Integer quantidadeEstoque = estoque.getEstoqueProduto(itemPedido.getProduto());
            if(quantidadeEstoque > 0 && quantidadeEstoque <= itemPedido.getQuantidade()){
                itemPedidos.add(itemPedido);
                estoque.atualizarQuantidadeProduto(itemPedido.getProduto(), (quantidadeEstoque - itemPedido.getQuantidade()));
                System.out.println("Item " + itemPedido.getProduto().getCodigo() + " adicionado com sucesso");
            }else{
                throw new Exception("Estoque insuficiente para adicionar o item codigo " + itemPedido.getProduto().getCodigo() + " !");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Double calcular(){
        return 0.0;
    }

    public void cupomFiscal(){

    }





}
