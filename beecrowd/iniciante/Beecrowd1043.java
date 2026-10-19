package beecrowd_basico;

/*
 * Beecrowd 1043 - Triângulo
 * Lê três valores reais (A, B e C) e verifica se formam um triângulo
 * (cada lado menor que a soma dos outros dois).
 * Se formam: imprime "Perimetro = X.X" (A + B + C).
 * Se não formam: calcula a área do trapézio com A e B como bases e C como altura,
 * e imprime "Area = X.X". Saídas com uma casa decimal.
 * https://judge.beecrowd.com/pt/problems/view/1043
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && c + b > a) {
            double calculo = a + b + c;
            System.out.printf("Perimetro = %.1f%n", calculo);
        } else {
            double calculo2 = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", calculo2);
        }
    }
}