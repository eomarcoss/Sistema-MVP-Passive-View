package supermercado;

import supermercado.repositorio.*;
import supermercado.repositorio.memoria.*;
import supermercado.servico.*;

/** Ponto unico de criacao dos repositorios e servicos. As Frames pegam tudo daqui. */
public final class Contexto {
    private Contexto() {}

    public static final CategoriaRepository categorias = new CategoriaRepositoryMemoria();
    public static final ProdutoRepository produtos = new ProdutoRepositoryMemoria();
    public static final HistoricoPrecoRepository historicos = new HistoricoPrecoRepositoryMemoria();

    public static final CategoriaService categoriaService = new CategoriaService(categorias, produtos);
    public static final ProdutoService produtoService = new ProdutoService(produtos, categorias);
    public static final PrecoService precoService = new PrecoService(produtos, categorias, historicos);
}
