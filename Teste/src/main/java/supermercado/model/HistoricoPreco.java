package supermercado.model;

import java.time.LocalDate;

/** Registro imutavel: nunca e alterado depois de criado. */
public class HistoricoPreco {
    private int id;
    private final Produto produto;
    private final LocalDate data;
    private final double percentualLucro;
    private final double precoVenda;

    public HistoricoPreco(Produto produto, LocalDate data, double percentualLucro, double precoVenda) {
        this.produto = produto;
        this.data = data;
        this.percentualLucro = percentualLucro;
        this.precoVenda = precoVenda;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Produto getProduto() { return produto; }
    public LocalDate getData() { return data; }
    public double getPercentualLucro() { return percentualLucro; }
    public double getPrecoVenda() { return precoVenda; }
}
