package supermercado.presenter;

import supermercado.view.BuscaProdutoView;
import supermercado.servico.ProdutoService;

/** PARTE 2. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class BuscaProdutoPresenter {
    private final BuscaProdutoView view;
    private final ProdutoService service;

    public BuscaProdutoPresenter(BuscaProdutoView view, ProdutoService service) {
        this.view = view;
        this.service = service;
    }

    public void iniciar() { /* TODO Parte 2: Visualizar desabilitado; listar todos */ }
    public void onBuscar() { /* TODO */ }
    public void onSelecionar() { /* TODO: habilitar Visualizar */ }
    public void onNovo() { /* TODO: ProdutoFormFrame.abrirInclusao() */ }
    public void onVisualizar() { /* TODO: ProdutoVisualizacaoFrame.abrir(produto) */ }
    public void onFechar() { view.fechar(); }
}
