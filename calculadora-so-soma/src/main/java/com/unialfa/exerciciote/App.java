package com.unialfa.exerciciote;

import javax.swing.*;
import java.lang.runtime.SwitchBootstraps;

public class App {

    public  static  void  main (String[] args) {
        SwingUtilities.invokeLater(() ->{
            var calculadora = new  Calculadora();
            calculadora.setVisible(true);
        });
    }
}
