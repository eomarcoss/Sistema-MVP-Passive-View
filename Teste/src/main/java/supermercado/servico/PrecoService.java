package supermercado.servico;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import supermercado.excecao.RegraNegocioException;
import supermercado.excecao.ValidacaoException;
import supermercado.model.HistoricoPreco;
import supermercado.model.Produto;
import supermercado.repositorio.CategoriaRepository;
import supermercado.repositorio.HistoricoPrecoRepository;
import supermercado.repositorio.ProdutoRepository;
import supermercado.util.Arredondamento;

/** PARTE 3. Calculo global, intervalo minimo de 10 dias, historico por produto. */
public class PrecoService {
    public static final int INTERVALO_MINIMO_DIAS = 10;

    private final ProdutoRepository produtos;
    private final CategoriaRepository categorias;
    private final HistoricoPrecoRepository historicos;

    public PrecoService(ProdutoRepository produtos, CategoriaRepository categorias,
                        HistoricoPrecoRepository historicos) {
        this.produtos = produtos;
        this.categorias = categorias;
        this.historicos = historicos;
    }

    /** custo x (1 + percentual/100), arredondado para 2 casas. Usado tambem pelo Seeder. */
    public static double calcularPrecoVenda(double custo, double percentual) {
        return Arredondamento.duasCasas(custo * (1 + percentual / 100.0));
    }

    public Optional<LocalDate> dataUltimoCalculo() { return historicos.buscarDataUltimoCalculo(); }

    /**
     * Valida data obrigatoria e intervalo >= 10 dias; processa TODOS os produtos,
     * atualiza margemAtual/precoVendaAtual e grava um HistoricoPreco por produto.
     * Se invalido, NAO altera nada.
     */
    public List<HistoricoPreco> calcularGlobal(LocalDate data) throws ValidacaoException, RegraNegocioException {
        throw new UnsupportedOperationException("TODO Parte 3");
    }

    /** Mais recente primeiro. */
    public List<HistoricoPreco> historicoDoProduto(Produto produto) {
        return historicos.buscarPorProduto(produto);
    }
}
