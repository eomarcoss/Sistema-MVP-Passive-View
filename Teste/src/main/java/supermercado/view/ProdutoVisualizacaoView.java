package supermercado.view;

/** PARTE 2. Todos os campos somente leitura. */
public interface ProdutoVisualizacaoView {
    void setNome(String nome);
    void setPrecoCusto(String precoCusto);
    void setCategoria(String categoria);
    void setMargem(String margem);
    void setPrecoVenda(String precoVenda);
    void fechar();
}
