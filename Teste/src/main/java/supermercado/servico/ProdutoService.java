package supermercado.servico;

import java.util.List;
import supermercado.excecao.ValidacaoException;
import supermercado.model.Categoria;
import supermercado.model.Produto;
import supermercado.repositorio.CategoriaRepository;
import supermercado.repositorio.ProdutoRepository;

/** PARTE 2. Regras: nome obrigatorio (nao so espacos), custo > 0, categoria existente no repositorio. */
public class ProdutoService {
    private final ProdutoRepository produtos;
    private final CategoriaRepository categorias;

    public ProdutoService(ProdutoRepository produtos, CategoriaRepository categorias) {
        this.produtos = produtos;
        this.categorias = categorias;
    }

    /** Sempre le do repositorio (reflete categorias criadas em execucao). */
    public List<Categoria> listarCategorias() { return categorias.listarTodas(); }

    public List<Produto> listarTodos() { return produtos.listarTodos(); }
    public List<Produto> buscarPorNome(String trecho) { return produtos.buscarPorNome(trecho); }
    public List<Produto> buscarPorCategoria(String trecho) { return produtos.buscarPorNomeCategoria(trecho); }

    public Produto incluir(String nome, Double precoCusto, Categoria categoria) throws ValidacaoException {
        throw new UnsupportedOperationException("TODO Parte 2");
    }
    /** Nao altera margem nem preco de venda. */
    public Produto atualizar(Produto produto, String nome, Double precoCusto, Categoria categoria)
            throws ValidacaoException {
        throw new UnsupportedOperationException("TODO Parte 2");
    }
}
