package Entities;

import javax.swing.*;
import java.awt.*;

public class EquipamentoPanel extends JPanel {
    public EquipamentoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcEquipamento = new GridBagConstraints();
        gbcEquipamento.gridx = 0;
        gbcEquipamento.gridy = 0;
        gbcEquipamento.anchor = GridBagConstraints.WEST;
        gbcEquipamento.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Descrição do Equipamento:"), gbcEquipamento);
        gbcEquipamento.gridx++;
        add(new JTextField(30), gbcEquipamento);

        gbcEquipamento.gridx = 0;
        gbcEquipamento.gridy++;
        add(new JLabel("Valor do Equipamento:"), gbcEquipamento);
        gbcEquipamento.gridx++;
        add(new JTextField(10), gbcEquipamento);
    }
}
