package Entities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraEvento extends JPanel {
    public CalculadoraEvento() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Adicione os campos necessários para exibir os resultados
        JTextField totalIngressosField = new JTextField(10);
        JTextField valorArrecadadoField = new JTextField(10);

        // Adicione um botão para calcular
        JButton calcularButton = new JButton("Calcular");
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularValores(totalIngressosField, valorArrecadadoField);
            }
        });

        add(new JLabel("Total de Ingressos Vendidos:"));
        add(totalIngressosField);
        add(new JLabel("Valor Arrecadado:"));
        add(valorArrecadadoField);
        add(calcularButton);
    }

    private void calcularValores(JTextField totalIngressosField, JTextField valorArrecadadoField) {
        // Implemente a lógica para calcular os valores
        // Use totalIngressosField e valorArrecadadoField conforme necessário
    }
}
