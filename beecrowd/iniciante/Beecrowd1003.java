package beecrowd_basico;

/*
 * Beecrowd 1003 - Soma Simples
 * Lê dois inteiros (A e B) e imprime a soma no formato "SOMA = valor".
 * https://judge.beecrowd.com/pt/problems/view/1003
 */

import java.util.Scanner;

public class Beecrowd1003 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int A,B, SOMA;
		    A = sc.nextInt();
		    B = sc.nextInt();
		    
		    SOMA = (A+B);
		    System.out.printf("SOMA = %d%n", SOMA);
		    
		    sc.close();

	}

}
