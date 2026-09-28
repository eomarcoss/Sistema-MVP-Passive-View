package supermercado.util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/** Formatacao pt-BR para exibir nas views. Retorna "" quando o valor e nulo. */
public final class Formatador {
    private static final Locale BR = Locale.of("pt", "BR");
    private static final DateTimeFormatter DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Formatador() {}

    public static String numero(Double v) {           // 25,00
        if (v == null) return "";
        NumberFormat nf = NumberFormat.getNumberInstance(BR);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return nf.format(v);
    }
    public static String moeda(Double v) {            // R$ 45,00
        return v == null ? "" : NumberFormat.getCurrencyInstance(BR).format(v);
    }
    public static String data(LocalDate d) {
        return d == null ? "" : DATA.format(d);
    }
    /** Converte "25,50" ou "25.50" em Double. Lanca NumberFormatException se invalido. */
    public static Double parseNumero(String texto) {
        if (texto == null || texto.isBlank()) return null;
        return Double.parseDouble(texto.trim().replace("R$", "").trim().replace(".", "").replace(",", "."));
    }
}
