package beecrowd_basico;

/*
 * Beecrowd 1005 - Média 1
 * Lê duas notas (A e B) e calcula a média ponderada (pesos 3.5 e 7.5),
 * com 5 casas decimais.
 * https://judge.beecrowd.com/pt/problems/view/1005
 */

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1005 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
		    double A,B, MEDIA;
		    A = sc.nextDouble();
		    B = sc.nextDouble();
		    
		    MEDIA = (A * 3.5 + B * 7.5) / 11;
		    System.out.printf("MEDIA = %.5f%n", MEDIA);
		    sc.close();	

	}

}
