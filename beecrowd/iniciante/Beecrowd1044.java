package beecrowd_basico;

/*
 * Beecrowd 1044 - Múltiplos
 * Lê dois inteiros (A e B) e informa se um é múltiplo do outro,
 * imprimindo "Sao Multiplos" ou "Nao sao Multiplos".
 * Usa o operador % (resto da divisão) para verificar a divisibilidade nos dois sentidos.
 * https://judge.beecrowd.com/pt/problems/view/1044
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2 && num1 % num2 == 0) {
            System.out.println("Sao multiplos.");
        }
        else if (num2 > num1 && num2 % num1 == 0) {
            System.out.println("Sao multiplos.");
        }
        else {
            System.out.println("Nao sao multiplos.");
        }
    }
}