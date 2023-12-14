package Entities;

import javax.swing.JTextField;

public class Calculadora {
    private JTextField totalIngressosField;
    private JTextField valorArrecadadoField;
    private JTextField[] valoresEntradaFields;
    private JTextField[] valoresIngressosFields;
    private JTextField valorBebidasField;
    private JTextField valorDecoracaoField;
    private JTextField valorSegurancaField;
    private JTextField valorBombeiroField;
    private JTextField valorLimpezaField;
    private JTextField valorSomField;
    private JTextField valorEspacoField;
    private JTextField valorEquipamentoField;
    
    public Calculadora(
        JTextField totalIngressosField,
        JTextField valorArrecadadoField,
        JTextField[] valoresEntradaFields,
        JTextField[] valoresIngressosFields,
        JTextField valorBebidasField,
        JTextField valorDecoracaoField,
        JTextField valorSegurancaField,
        JTextField valorBombeiroField,
        JTextField valorLimpezaField,
        JTextField valorSomField,
        JTextField valorEspacoField,
        JTextField valorEquipamentoField
    ) {
        this.totalIngressosField = totalIngressosField;
        this.valorArrecadadoField = valorArrecadadoField;
        this.valoresEntradaFields = valoresEntradaFields;
        this.valoresIngressosFields = valoresIngressosFields;
        this.valorBebidasField = valorBebidasField;
        this.valorDecoracaoField = valorDecoracaoField;
        this.valorSegurancaField = valorSegurancaField;
        this.valorBombeiroField = valorBombeiroField;
        this.valorLimpezaField = valorLimpezaField;
        this.valorSomField = valorSomField;
        this.valorEspacoField = valorEspacoField;
        this.valorEquipamentoField = valorEquipamentoField;
        
        configurarListeners();
    }

    private void configurarListeners() {
        // Adicione aqui os listeners necessários para atualizar os cálculos quando os campos forem alterados
    }

    private void calcularValores() {
        // Implemente a lógica de cálculo com base nos campos de entrada
    }
}
