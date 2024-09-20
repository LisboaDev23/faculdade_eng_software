package org.example;

public class AlgoritmoRecursivoSemCauda {

    public static void main(String[] args) {

        fatNovo(5,1, 5);

    }

    public static void fatorial (int n,int x,int f) {
        if (x == 0 || x == 1) {
            System.out.println("Fatorial de " + n + " é " + f);
        }
        else {
            fatorial(n, x -1, f*x);
        }
    }

    public static void fatNovo (int n, int acumuladorDoFatorial, int representante) {
        //condição de parada, se o número digitado for ou chegar a ser 0 ou 1, imprima na tela o fatorial
        if (n == 0 || n == 1) {
            System.out.println("O fatorial de " + representante + " é " + acumuladorDoFatorial);
        }
        //senão
        else {
            //acumulador inicialmente 1, é ele mesmo * (numero digitado - 1)
            acumuladorDoFatorial*= n;
            //fazer fatorial de novo onde o 1° parâmetro será o número digitado -1 novamente até n ser 1 ou 0
            fatNovo(n-1, acumuladorDoFatorial, representante); // a cada passada na função recursiva o acumulador irá multiplicar com o número que está se reduzindo
        }
    }
}
