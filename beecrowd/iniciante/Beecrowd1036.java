package beecrowd_basico;
/*
 * Beecrowd 1036 - Fórmula de Bhaskara
 * Lê três valores (A, B, C) e calcula as raízes da equação de segundo grau.
 * Se a == 0 ou delta < 0, imprime "Impossivel calcular".
 * https://judge.beecrowd.com/pt/problems/view/1036
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - 4.0 * a * c;
        if (delta == 0 || delta < 0.0) {
            System.out.println("Impossível calcular");
        }
        else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }

        sc.close();
    }
}
