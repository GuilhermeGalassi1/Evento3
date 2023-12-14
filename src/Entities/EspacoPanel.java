package Entities;

import javax.swing.*;

import com.toedter.calendar.JCalendar;

import java.awt.*;

public class EspacoPanel extends JPanel {
    public EspacoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbcEspaco = new GridBagConstraints();
        gbcEspaco.gridx = 0;
        gbcEspaco.gridy = 0;
        gbcEspaco.anchor = GridBagConstraints.WEST;
        gbcEspaco.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Localização:"), gbcEspaco);
        gbcEspaco.gridx++;
        add(new JTextField(30), gbcEspaco);

        gbcEspaco.gridx = 0;
        gbcEspaco.gridy++;
        add(new JLabel("Horário:"), gbcEspaco);
        gbcEspaco.gridx++;
        add(new JTextField(30), gbcEspaco);

        gbcEspaco.gridx = 0;
        gbcEspaco.gridy++;
        add(new JLabel("Data:"), gbcEspaco);
        gbcEspaco.gridx++;
        add(new JCalendar(), gbcEspaco);

        gbcEspaco.gridx = 0;
        gbcEspaco.gridy++;
        add(new JLabel("Valor do Espaço:"), gbcEspaco);
        gbcEspaco.gridx++;
        add(new JTextField(10), gbcEspaco);
    }
}
