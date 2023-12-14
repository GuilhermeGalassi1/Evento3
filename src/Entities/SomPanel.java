package Entities;

import javax.swing.*;
import java.awt.*;

public class SomPanel extends JPanel {
    public SomPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcSom = new GridBagConstraints();
        gbcSom.gridx = 0;
        gbcSom.gridy = 0;
        gbcSom.anchor = GridBagConstraints.WEST;
        gbcSom.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição do Som:"), gbcSom);
        gbcSom.gridx++;
        add(new JTextField(30), gbcSom);

        gbcSom.gridx = 0;
        gbcSom.gridy++;
        add(new JLabel("Valor do Som:"), gbcSom);
        gbcSom.gridx++;
        add(new JTextField(10), gbcSom);
    }
}
