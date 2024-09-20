package org.example;

public class AlgoritmoRecursivoPotencia {
    public static void main(String[] args) {

        System.out.println("Digite a base e o expoente para cálculo da potência");

    }

    public static int pot(int base, int expoente){

        if (base == 0){
            return 0;
        }
        else {
            if (expoente == 0){
                return 1;
            } else {
                return pot(base, expoente-1) * base;
            }
        }
    }
}
