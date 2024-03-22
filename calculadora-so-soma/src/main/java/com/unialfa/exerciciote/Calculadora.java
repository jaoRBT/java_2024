package com.unialfa.exerciciote;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    private JTextField campoValor1;
    private JTextField campoValor2;
    private JButton botaoSomar;

    public Calculadora(){
        setTitle("Calculdora que só soma");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        campoValor1 = new JTextField(10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        painel.add(campoValor1,constraints);

        campoValor2 = new JTextField(10);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painel.add(campoValor2,constraints);

        botaoSomar = new JButton("Somar");
        botaoSomar.addActionListener(e -> somar());
        constraints.gridx = 2;
        constraints.gridy = 0;
        painel.add(botaoSomar, constraints);

        add(painel);
        setLocationRelativeTo(null);
    }
    private  void  somar(){
        var valor1 = Integer.parseInt(campoValor1.getText());
        var valor2 = Integer.parseInt(campoValor2.getText());
        var total = valor1 + valor2;
        JOptionPane.showMessageDialog(this,"Resultado " + total);
    }


}

