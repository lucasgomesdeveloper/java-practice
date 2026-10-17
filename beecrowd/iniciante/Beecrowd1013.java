package beecrowd_basico;

/*
 * Beecrowd 1013 - O Maior
 * Lê três inteiros e imprime o maior deles, usando a fórmula
 * maior = (a + b + |a - b|) / 2, aplicada duas vezes.
 * https://judge.beecrowd.com/pt/problems/view/1013
 */

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf("%d eh o maior%n", maior);

    }
}
