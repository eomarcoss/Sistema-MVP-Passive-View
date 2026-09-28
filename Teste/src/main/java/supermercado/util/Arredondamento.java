package supermercado.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Arredondamento {
    private Arredondamento() {}

    /** Arredonda para 2 casas (HALF_UP). Use SEMPRE este metodo (PrecoService e Seeder). */
    public static double duasCasas(double valor) {
        return BigDecimal.valueOf(valor).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
