package supermercado.view;

import java.time.LocalDate;
import java.util.List;
import supermercado.model.HistoricoPreco;

/** PARTE 3. */
public interface CalculoMargemView {
    LocalDate getData();                        // null se vazia
    void setResultados(List<HistoricoPreco> resultados);
    void mostrarErro(String mensagem);
    void mostrarInfo(String mensagem);
    void fechar();
}
