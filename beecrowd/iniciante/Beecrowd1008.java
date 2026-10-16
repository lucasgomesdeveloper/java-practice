package beecrowd_basico;

/*
 * Beecrowd 1008 - Salário
 * Lê número do funcionário, horas trabalhadas e valor por hora.
 * Imprime o número e o salário (horas x valor por hora).
 * https://judge.beecrowd.com/pt/problems/view/1008
 */

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double salario_fixo = sc.nextDouble();
        double total_vendas = sc.nextDouble();
        double salario_final = (0.15 * total_vendas) + salario_fixo;
        System.out.printf("TOTAL R$ = %.2f%n", salario_final);
        sc.close();


    }
}
