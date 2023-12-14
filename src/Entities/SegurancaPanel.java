package Entities;

import javax.swing.*;
import java.awt.*;

public class SegurancaPanel extends JPanel {
    public SegurancaPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcSeguranca = new GridBagConstraints();
        gbcSeguranca.gridx = 0;
        gbcSeguranca.gridy = 0;
        gbcSeguranca.anchor = GridBagConstraints.WEST;
        gbcSeguranca.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição da Segurança:"), gbcSeguranca);
        gbcSeguranca.gridx++;
        add(new JTextField(30), gbcSeguranca);

        gbcSeguranca.gridx = 0;
        gbcSeguranca.gridy++;
        add(new JLabel("Valor da Segurança:"), gbcSeguranca);
        gbcSeguranca.gridx++;
        add(new JTextField(10), gbcSeguranca);
    }
}
