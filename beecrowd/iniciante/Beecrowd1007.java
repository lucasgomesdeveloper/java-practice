package beecrowd_basico;

/*
 * Beecrowd 1007 - Diferença
 * Lê quatro inteiros (A, B, C e D) e calcula a diferença do produto
 * de A e B pelo produto de C e D: A * B - C * D.
 * https://judge.beecrowd.com/pt/problems/view/1007
 */

import java.util.Scanner;
public class Beecrowd1007 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		    int A,B,C,D, DIFERENCA;
		    A = sc.nextInt();
		    B = sc.nextInt();
		    C = sc.nextInt();
		    D = sc.nextInt();
		    
		    DIFERENCA = (A * B - C * D);
		    System.out.printf("DIFERENCA = %d%n", DIFERENCA);
	sc.close();

	}

}
