package supermercado.view;

import java.util.List;
import supermercado.model.HistoricoPreco;

/** PARTE 3. Tabela somente leitura: Data | Percentual de lucro (%) | Preco de venda. */
public interface HistoricoPrecoView {
    void setProduto(String nome);
    void setCategoria(String nome);
    void setRegistros(List<HistoricoPreco> registros);
    void fechar();
}
