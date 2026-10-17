package beecrowd_basico;

/*
 * Beecrowd 1006 - Média 2
 * Lê três notas (A, B e C) e calcula a média ponderada (pesos 2, 3 e 5),
 * com 1 casa decimal.
 * https://judge.beecrowd.com/pt/problems/view/1006
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    double A,B,C, MEDIA;
	    A = sc.nextDouble();
	    B = sc.nextDouble();
	    C = sc.nextDouble();
	    
	    MEDIA = (A * 2 + B * 3 + C * 5) / 10;
	    System.out.printf("MEDIA = %.1f%n", MEDIA);
	    sc.close();

	}

}
