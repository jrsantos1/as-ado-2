package facade.exercicio4;

import java.util.*;

public class Estoque {
    private Set<Estoque> estoque = new HashSet<>();
    private Produto produto;
    private Integer quantidade;


    public Estoque(){

        Produto produto1 = new Produto(1, 20.00, "Alimento");
        Produto produto2 = new Produto(2, 20.00, "Alimento");
        Produto produto3 = new Produto(3, 20.00, "Alimento");
        Produto produto4 = new Produto(4, 20.00, "Alimento");

        this.estoque.add(new Estoque(produto1, 2));
        this.estoque.add(new Estoque(produto2, 2));
        this.estoque.add(new Estoque(produto3, 2));
        this.estoque.add(new Estoque(produto4, 2));
    }

    public Estoque(Produto produto, Integer quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getEstoqueProduto(Produto produto){
        for(Estoque estoques: estoque){
            if(estoques.produto == produto){
                return estoques.quantidade;
            }
        }
        return 0;
    }

    public void setItem(Produto produto, Integer quantidade){

    }
    public void removeItem(Produto produto){
        for(Estoque estoques: estoque){
            if(estoques.produto == produto){
                estoque.remove(estoques);
            }
        }
    }
    public void exibirEstoque() {
        for(Estoque estoques: estoque){
            System.out.println(estoques);
        }
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estoque estoque = (Estoque) o;
        return Objects.equals(produto, estoque.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto);
    }


    public void atualizarQuantidadeProduto(Produto produto, Integer novoQuantidade) {
        for(Estoque estoques: estoque){
            if(estoques.produto == produto){
                estoques.setQuantidade(novoQuantidade);
            }
        }
    }
}
