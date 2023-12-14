package Entities;

import javax.swing.*;
import java.awt.*;

public class BombeiroPanel extends JPanel {
    public BombeiroPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcBombeiro = new GridBagConstraints();
        gbcBombeiro.gridx = 0;
        gbcBombeiro.gridy = 0;
        gbcBombeiro.anchor = GridBagConstraints.WEST;
        gbcBombeiro.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição do Bombeiro:"), gbcBombeiro);
        gbcBombeiro.gridx++;
        add(new JTextField(30), gbcBombeiro);

        gbcBombeiro.gridx = 0;
        gbcBombeiro.gridy++;
        add(new JLabel("Valor do Bombeiro:"), gbcBombeiro);
        gbcBombeiro.gridx++;
        add(new JTextField(10), gbcBombeiro);
    }
}
