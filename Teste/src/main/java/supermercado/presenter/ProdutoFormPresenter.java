package supermercado.presenter;

import supermercado.model.Produto;
import supermercado.view.ProdutoFormView;
import supermercado.servico.ProdutoService;

/** PARTE 2. Recebe eventos da view, chama o servico e atualiza a view pela interface. */
public class ProdutoFormPresenter {
    private final ProdutoFormView view;
    private final ProdutoService service;
    private final Produto produtoEmEdicao; // null = inclusao

    public ProdutoFormPresenter(ProdutoFormView view, ProdutoService service, Produto produtoEmEdicao) {
        this.view = view;
        this.service = service;
        this.produtoEmEdicao = produtoEmEdicao;
    }

    public void iniciar() { /* TODO Parte 2: carregar combo do repositorio; preencher se edicao */ }
    public void onSalvar() { /* TODO */ }
    public void onCancelar() { view.fechar(); }
}
