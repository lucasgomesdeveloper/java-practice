
package beecrowd_basico;

/*
 * Beecrowd 1040 - Média 3
 * Lê quatro notas e calcula a média ponderada (pesos 2, 3, 4 e 1).
 * Média >= 7.0: aprovado. Entre 5.0 e 6.9: em exame, lê a nota do exame
 * e recalcula a média final. Abaixo de 5.0: reprovado.
 * Obs: usei float em vez de double para bater com o arredondamento do juiz.
 * https://judge.beecrowd.com/pt/problems/view/1040
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        float calculo = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4 * 1) / 10;
        System.out.printf("Media: %.1f%n", calculo);
        if (calculo >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        else if(calculo >= 5.0) {
            System.out.println("Aluno em exame.");
            float nota_exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", nota_exame);
            float media_final = (nota_exame + calculo) / 2;
            if (media_final >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", media_final);
            }
            else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media: %.1f%n", calculo);
            }
            }
        else {
            System.out.println("Aluno reprovado.");
        }
        }
    }