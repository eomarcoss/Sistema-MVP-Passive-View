package supermercado.view;

import java.util.List;
import supermercado.model.Categoria;

/** PARTE 2. Mesma janela para inclusao e edicao. Margem e preco de venda sempre bloqueados. */
public interface ProdutoFormView {
    String getNome();
    String getPrecoCusto();
    Categoria getCategoriaSelecionada();
    void setNome(String nome);
    void setPrecoCusto(String precoCusto);
    void setCategorias(List<Categoria> categorias);
    void setCategoriaSelecionada(Categoria categoria);
    void setMargem(String margem);
    void setPrecoVenda(String precoVenda);
    void mostrarErro(String mensagem);
    void mostrarInfo(String mensagem);
    void fechar();
}
