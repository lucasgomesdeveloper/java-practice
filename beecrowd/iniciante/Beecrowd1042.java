package beecrowd_basico;

/*
 * Beecrowd 1042 - Ordenando
 * Lê três inteiros e imprime em ordem crescente, uma linha em branco
 * e depois os valores na ordem em que foram lidos.
 * Usa if / else if para comparar os valores e definir a ordem.
 * https://judge.beecrowd.com/pt/problems/view/1042
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();

        if (valor1 < valor2 && valor1 < valor3 && valor3 < valor2) {
            System.out.printf("%d%n", valor1);
            System.out.printf("%d%n", valor3);
            System.out.printf("%d%n", valor2);
        }
        else if (valor2 < valor1 && valor2 < valor3 && valor3 < valor1) {
            System.out.printf("%d%n", valor2);
            System.out.printf("%d%n", valor3);
            System.out.printf("%d%n", valor1);
        }
        else if (valor2 < valor3 && valor2 < valor1 && valor1 < valor3) {
            System.out.printf("%d%n", valor2);
            System.out.printf("%d%n", valor1);
            System.out.printf("%d%n", valor3);
        }
        else if (valor3 < valor1 && valor3 < valor2 && valor1 < valor2) {
            System.out.printf("%d%n", valor3);
            System.out.printf("%d%n", valor1);
            System.out.printf("%d%n", valor2);
        }
        else if (valor3 < valor1 && valor3 < valor2 && valor2 < valor1) {
            System.out.printf("%d%n", valor3);
            System.out.printf("%d%n", valor2);
            System.out.printf("%d%n", valor1);
        }
        else {
            System.out.printf("%d%n", valor1);
            System.out.printf("%d%n", valor2);
            System.out.printf("%d%n", valor3);
        }
        System.out.printf("%n%d%n", valor1);
        System.out.printf("%d%n", valor2);
        System.out.printf("%d%n", valor3);
    }

}