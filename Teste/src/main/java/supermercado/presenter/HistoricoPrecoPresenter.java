package supermercado.presenter;

import supermercado.model.Produto;
import supermercado.view.HistoricoPrecoView;
import supermercado.servico.PrecoService;

/** PARTE 3. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class HistoricoPrecoPresenter {
    private final HistoricoPrecoView view;
    private final PrecoService service;
    private final Produto produto;

    public HistoricoPrecoPresenter(HistoricoPrecoView view, PrecoService service, Produto produto) {
        this.view = view;
        this.service = service;
        this.produto = produto;
    }

    public void iniciar() { /* TODO Parte 3 */ }
    public void onFechar() { view.fechar(); }
}
