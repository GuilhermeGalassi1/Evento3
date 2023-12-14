package Entities;

import javax.swing.*;
import java.awt.*;

public class LimpezaPanel extends JPanel {
    public LimpezaPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcLimpeza = new GridBagConstraints();
        gbcLimpeza.gridx = 0;
        gbcLimpeza.gridy = 0;
        gbcLimpeza.anchor = GridBagConstraints.WEST;
        gbcLimpeza.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição da Limpeza:"), gbcLimpeza);
        gbcLimpeza.gridx++;
        add(new JTextField(30), gbcLimpeza);

        gbcLimpeza.gridx = 0;
        gbcLimpeza.gridy++;
        add(new JLabel("Valor da Limpeza:"), gbcLimpeza);
        gbcLimpeza.gridx++;
        add(new JTextField(10), gbcLimpeza);
    }
}
