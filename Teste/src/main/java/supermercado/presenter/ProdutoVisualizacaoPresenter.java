package supermercado.presenter;

import supermercado.model.Produto;
import supermercado.view.ProdutoVisualizacaoView;


/** PARTE 2. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class ProdutoVisualizacaoPresenter {
    private final ProdutoVisualizacaoView view;
    private final Produto produto;

    public ProdutoVisualizacaoPresenter(ProdutoVisualizacaoView view, Produto produto) {
        this.view = view;
        this.produto = produto;
    }

    public void iniciar() { /* TODO Parte 2 */ }
    public void onVisualizarHistorico() { /* TODO: HistoricoPrecoFrame.abrir(produto) */ }
    public void onEditar() { /* TODO: ProdutoFormFrame.abrirEdicao(produto) */ }
    public void onFechar() { view.fechar(); }
}
