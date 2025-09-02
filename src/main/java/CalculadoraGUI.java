package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame {
    private JTextField campoA, campoB, resultado;

    public CalculadoraGUI() {
        setTitle("== Calculadora ==");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        JPanel painelEntrada = new JPanel(new GridLayout(1, 1));
        painelEntrada.add(new JLabel("Valor A:"));
        campoA = new JTextField();
        painelEntrada.add(campoA);
        painelEntrada.add(new JLabel("Valor B:"));
        campoB = new JTextField();
        painelEntrada.add(campoB);
        add(painelEntrada);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 3));
        String[] operacoes = {"Soma", "Subtração", "Multiplicação", "Divisão",
                "Potência", "Raiz A", "Raiz B", "Porcentagem", "Fatorial A", "Fatorial B", "Log b (A)"};
        for (String op : operacoes) {
            JButton botao = new JButton(op);
            painelBotoes.add(botao);
            botao.addActionListener(new OperacaoListener());
        }
        add(painelBotoes);

        JPanel painelResultado = new JPanel();
        painelResultado.add(new JLabel("Resultado:"));
        resultado = new JTextField(15);
        resultado.setEditable(false);
        painelResultado.add(resultado);
        add(painelResultado);
    }

    private class OperacaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double a = Double.parseDouble(campoA.getText());
                double b = Double.parseDouble(campoB.getText());
                Calculadora c = new Calculadora(a, b);
                String comando = ((JButton) e.getSource()).getText();

                switch (comando) {
                    case "Soma" -> resultado.setText(String.valueOf(c.soma()));
                    case "Subtração" -> resultado.setText(String.valueOf(c.subtracao()));
                    case "Multiplicação" -> resultado.setText(String.valueOf(c.multiplicacao()));
                    case "Divisão" -> resultado.setText(String.valueOf(c.divisao()));
                    case "Potência" -> resultado.setText(String.valueOf(c.potencia()));
                    case "Raiz A" -> resultado.setText(String.valueOf(c.raizQuadradaA()));
                    case "Raiz B" -> resultado.setText(String.valueOf(c.raizQuadradaB()));
                    case "Porcentagem" -> resultado.setText(String.valueOf(c.porcentagem()));
                    case "Fatorial A" -> resultado.setText(String.valueOf(c.fatorialA()));
                    case "Fatorial B" -> resultado.setText(String.valueOf(c.fatorialB()));
                    case "Log b (A)" -> resultado.setText(String.valueOf(c.logBase()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraGUI().setVisible(true));
    }
}
