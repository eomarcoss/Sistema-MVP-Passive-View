package supermercado;

import javax.swing.SwingUtilities;
import supermercado.seeder.Seeder;
import supermercado.view.MainFrame;

/** PARTE 1. */
public class Main {
    public static void main(String[] args) {
        Seeder.executar();                              // antes da tela principal
        SwingUtilities.invokeLater(MainFrame::abrir);
    }
}
