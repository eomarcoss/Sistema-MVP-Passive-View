package supermercado.servico;

import java.util.List;
import supermercado.excecao.RegraNegocioException;
import supermercado.excecao.ValidacaoException;
import supermercado.model.Categoria;
import supermercado.repositorio.CategoriaRepository;
import supermercado.repositorio.ProdutoRepository;

/** PARTE 1. Regras: nome obrigatorio e unico (ignora caixa), percentual >= 0, exclusao bloqueada com produtos. */
public class CategoriaService {
    private final CategoriaRepository categorias;
    private final ProdutoRepository produtos;

    public CategoriaService(CategoriaRepository categorias, ProdutoRepository produtos) {
        this.categorias = categorias;
        this.produtos = produtos;
    }

    public List<Categoria> listar() { return categorias.listarTodas(); }

    public Categoria incluir(String nome, Double percentual) throws ValidacaoException {
        throw new UnsupportedOperationException("TODO Parte 1");
    }
    /** Ao checar duplicidade, ignorar a propria categoria. */
    public Categoria atualizar(Categoria categoria, String nome, Double percentual) throws ValidacaoException {
        throw new UnsupportedOperationException("TODO Parte 1");
    }
    public void excluir(Categoria categoria) throws RegraNegocioException {
        throw new UnsupportedOperationException("TODO Parte 1");
    }
}
