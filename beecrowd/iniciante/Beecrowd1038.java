package beecrowd_basico;

/*
 * Beecrowd 1038 - Lanche
 * Lê o código de um item (1 a 5) e a quantidade pedida, e calcula o valor da conta:
 * 1 = Cachorro Quente (R$ 4.00), 2 = X-Salada (R$ 4.50), 3 = X-Bacon (R$ 5.00),
 * 4 = Torrada simples (R$ 2.00), 5 = Refrigerante (R$ 1.50).
 * Imprime "Total: R$ valor" com 2 casas decimais.
 * Usa switch para escolher o preço de acordo com o código.
 * https://judge.beecrowd.com/pt/problems/view/1038
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch (num1) {
            case 1:
                double total1 =  num2 * 4.00;
                System.out.printf("Total: R$ %.2f%n", total1);
                break;
            case 2:
                double total2 = num2 * 4.50;
                System.out.printf("Total: R$ %.2f%n", total2);
                break;
            case 3:
                double total3 = num2 * 5.00;
                System.out.printf("Total: R$ %.2f%n", total3);
                break;
            case 4:
                double total4 = num2 * 2.00;
                System.out.printf("Total: R$ %.2f%n", total4);
                break;
            case 5:
                double total5 = num2 * 1.50;
                System.out.printf("Total: R$ %.2f%n", total5);
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
