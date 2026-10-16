package beecrowd_basico;
/*
 * Beecrowd 1035 - Teste de Seleção 1
 * Lê quatro inteiros (A, B, C, D) e imprime "Valores aceitos" se:
 * B > C, D > A, C + D > A + B, C e D positivos e A par.
 * Caso contrário, imprime "Valores nao aceitos".
 * https://judge.beecrowd.com/pt/problems/view/1035
 */

import java.util.Scanner;

public class Beecrowd1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (B > C && D > A && C + D > A + B && A > 0 && B > 0 && C > 0 && D > 0 && A % 2 == 0) {
            System.out.printf("%nValores aceitos");
        }
        else {
            System.out.printf("%nValores não aceitos");
        }

    }
}
