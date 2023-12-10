package Entities;

import javax.swing.*;
import java.awt.*;

public class GastosPanel extends JPanel {
    public GastosPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Adiciona as subabas dentro da aba Gastos
        JTabbedPane tabbedPaneGastos = new JTabbedPane();
        tabbedPaneGastos.addTab("Bebidas", new BebidasPanel()); 
        tabbedPaneGastos.addTab("Bombeiro", new BombeiroPanel());  
        tabbedPaneGastos.addTab("Decoração", new DecoracaoPanel());
        tabbedPaneGastos.addTab("Equipamento", new EquipamentoPanel());
        tabbedPaneGastos.addTab("Espaço", new EspacoPanel());
        tabbedPaneGastos.addTab("Segurança", new SegurancaPanel());
        tabbedPaneGastos.addTab("Limpeza", new LimpezaPanel());
        tabbedPaneGastos.addTab("Som", new SomPanel());
        
        

        gbc.gridx = 0;
        gbc.gridy++;
        add(tabbedPaneGastos, gbc);
    }
}
