package beecrowd_basico;

/*
 * Beecrowd 1041 - Coordenadas de um Ponto
 * Lê as coordenadas (x, y) de um ponto e informa onde ele está no plano:
 * "Origem" (0,0), "Eixo X", "Eixo Y" ou o quadrante (Q1, Q2, Q3, Q4).
 * Usa if / else if, testando primeiro a origem e os eixos, depois os sinais de x e y.
 * https://judge.beecrowd.com/pt/problems/view/1041
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }

        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        }
}
