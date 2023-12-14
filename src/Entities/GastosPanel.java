package Entities;

import javax.swing.*;
import java.awt.*;

public class GastosPanel extends JPanel {
    public GastosPanel() {
        setLayout(new BorderLayout());

        JTabbedPane tabbedPaneGastos = new JTabbedPane();
        tabbedPaneGastos.addTab("Decoração", new DecoracaoPanel());
        tabbedPaneGastos.addTab("Bebidas", new BebidasPanel());
        tabbedPaneGastos.addTab("Segurança", new SegurancaPanel());
        tabbedPaneGastos.addTab("Bombeiro", new BombeiroPanel());
        tabbedPaneGastos.addTab("Limpeza", new LimpezaPanel());
        tabbedPaneGastos.addTab("Som", new SomPanel());
        tabbedPaneGastos.addTab("Espaço", new EspacoPanel());
        tabbedPaneGastos.addTab("Equipamento", new EquipamentoPanel());

        add(tabbedPaneGastos, BorderLayout.CENTER);
    }
}
