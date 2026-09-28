package supermercado.presenter;

import supermercado.view.CategoriaView;
import supermercado.servico.CategoriaService;

/** PARTE 1. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class CategoriaPresenter {
    private final CategoriaView view;
    private final CategoriaService service;

    public CategoriaPresenter(CategoriaView view, CategoriaService service) {
        this.view = view;
        this.service = service;
    }

    public void iniciar() { /* TODO Parte 1: carregar tabela, modo visualizacao */ }
    public void onSelecionar() { /* TODO */ }
    public void onNovo() { /* TODO */ }
    public void onEditar() { /* TODO */ }
    public void onExcluir() { /* TODO: confirmar; bloquear se houver produtos */ }
    public void onSalvar() { /* TODO: converter texto -> Double e chamar service */ }
    public void onCancelar() { /* TODO */ }
    public void onFechar() { view.fechar(); }
}
