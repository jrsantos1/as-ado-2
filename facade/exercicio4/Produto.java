package facade.exercicio4;

import java.util.Objects;

public class Produto {

    private Integer codigo;
    private Double preco;
    private String categoria;

    public Produto(Integer codigo, Double preco, String categoria) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo) && Objects.equals(preco, produto.preco) && Objects.equals(categoria, produto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, preco, categoria);
    }

}
