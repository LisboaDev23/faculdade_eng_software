package org.example;

import javax.swing.*;

public class AtividadeProgramacaoI {
    public static void main(String[] args) {
        Integer qtdDigitosInput = Integer.parseInt(JOptionPane.showInputDialog("De 1 a 10, quantas vezes gostaria de digitar um número?"));
        if (qtdDigitosInput <1 || qtdDigitosInput > 10) {
            JOptionPane.showMessageDialog(null, "Número inválido!", "Número deve ser de 1 a 10", JOptionPane.ERROR_MESSAGE);
        } else {
            Lista lista = new Lista(qtdDigitosInput);
            Integer count = 0;
            for (int i = 0; i < qtdDigitosInput; i++){
                Integer numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para guardá-lo na lista!"));
                lista.getListaNumeros().add(numeroDigitado);
                count+= numeroDigitado;
            }
            JOptionPane.showMessageDialog(null, "A soma de todos os números digitado foi: " + count);
            JOptionPane.showMessageDialog(null, "Os numeros digitados foram: " + lista.getListaNumeros().toString());
        }
    }
}


