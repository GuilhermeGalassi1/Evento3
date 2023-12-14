package Entities;

import javax.swing.*;
import java.awt.*;

public class DecoracaoPanel extends JPanel {
    public DecoracaoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcDecoracao = new GridBagConstraints();
        gbcDecoracao.gridx = 0;
        gbcDecoracao.gridy = 0;
        gbcDecoracao.anchor = GridBagConstraints.WEST;
        gbcDecoracao.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição da Decoração:"), gbcDecoracao);
        gbcDecoracao.gridx++;
        add(new JTextField(30), gbcDecoracao);

        gbcDecoracao.gridx = 0;
        gbcDecoracao.gridy++;
        add(new JLabel("Valor da Decoração:"), gbcDecoracao);
        gbcDecoracao.gridx++;
        add(new JTextField(10), gbcDecoracao);
    }
}
