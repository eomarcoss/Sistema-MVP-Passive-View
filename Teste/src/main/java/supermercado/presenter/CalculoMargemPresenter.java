package supermercado.presenter;

import supermercado.view.CalculoMargemView;
import supermercado.servico.PrecoService;

/** PARTE 3. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class CalculoMargemPresenter {
    private final CalculoMargemView view;
    private final PrecoService service;

    public CalculoMargemPresenter(CalculoMargemView view, PrecoService service) {
        this.view = view;
        this.service = service;
    }

    public void iniciar() { /* TODO Parte 3 */ }
    public void onCalcular() { /* TODO: tratar ValidacaoException e RegraNegocioException */ }
    public void onFechar() { view.fechar(); }
}
