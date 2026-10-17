package beecrowd_basico;

/*
 * Beecrowd 1037 - Intervalo
 * Lê um número com ponto flutuante e informa em qual intervalo ele está:
 * [0,25], (25,50], (50,75] ou (75,100]. Fora desses, imprime "Fora de intervalo".
 * Usa if / else if com && para testar os limites de cada faixa.
 * https://judge.beecrowd.com/pt/problems/view/1037
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num >= 0 && num <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (num > 25 && num <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (num >= 50 && num <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else if (num >= 75 && num <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
    }

}
