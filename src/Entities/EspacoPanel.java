package Entities;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class EspacoPanel extends JPanel {
	
    public EspacoPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        add(new JLabel("Localização:"), gbc);
        gbc.gridx++;
        add(new JTextField(20), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Horário:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Data:"), gbc);
        gbc.gridx++;

        // Substituído JCalendar por JDateChooser
        add(new JDateChooser(), gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Valor do Espaço:"), gbc);
        gbc.gridx++;
        add(new JTextField(10), gbc);
    }
}
