package supermercado.view;

import java.util.List;
import supermercado.model.Produto;

/** PARTE 2. */
public interface BuscaProdutoView {
    String getCriterio();                       // "Nome do produto" | "Categoria"
    String getTexto();
    void setProdutos(List<Produto> produtos);
    Produto getProdutoSelecionado();            // null se nada selecionado
    void setVisualizarHabilitado(boolean habilitado);
    void mostrarErro(String mensagem);
    void fechar();
}
