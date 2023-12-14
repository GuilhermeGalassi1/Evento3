package Entities;

import javax.swing.*;
import java.awt.*;

public class BebidasPanel extends JPanel {
    public BebidasPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcBebidas = new GridBagConstraints();
        gbcBebidas.gridx = 0;
        gbcBebidas.gridy = 0;
        gbcBebidas.anchor = GridBagConstraints.WEST;
        gbcBebidas.insets = new Insets(5, 5, 5, 5);

        String[] tiposBebidas = {"Água", "Destilado", "Fermentado", "Suco", "Refrigerante"};

        for (String tipo : tiposBebidas) {
            add(new JLabel("Descrição de " + tipo + ":"), gbcBebidas);
            gbcBebidas.gridx++;
            add(new JTextField(30), gbcBebidas);
            gbcBebidas.gridx = 0;
            gbcBebidas.gridy++;
        }

        gbcBebidas.gridx = 0;
        gbcBebidas.gridy++;
        add(new JLabel("Valor Total de Bebidas:"), gbcBebidas);
        gbcBebidas.gridx++;
        add(new JTextField(10), gbcBebidas);
    }
}
