package Entities;

import javax.swing.*;
import java.awt.*;

public class DecoracaoPanel extends JPanel {
    public DecoracaoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição da Decoração:"), gbc);
        gbc.gridx++;
        add(new JTextField(30), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor da Decoração:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
