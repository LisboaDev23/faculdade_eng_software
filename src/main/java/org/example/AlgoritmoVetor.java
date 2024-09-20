package org.example;

import javax.swing.*;
import java.util.Arrays;

public class AlgoritmoVetor {
    public static void main(String[] args) {

        double acumulador = 0;
        double [] vetor = new double[50];

        for (int i = 0; i < vetor.length; i++){
            try {
                double inputResposta =
                        Double.parseDouble(JOptionPane.showInputDialog("Insira um valor para ser feita a média aritmética"));
                acumulador = acumulador + inputResposta;
                vetor[i] = inputResposta;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Insira um número válido!",
                        "Error" ,JOptionPane.ERROR_MESSAGE);
            }
        }
        double mediaAritmetica = acumulador / vetor.length;
        JOptionPane.showMessageDialog(null, "Média aritmética é " + mediaAritmetica,
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(Arrays.toString(vetor));
    }
}
