package beecrowd_basico;

/*
 * Beecrowd 1002 - Área do Círculo
 * Lê o raio e calcula a área do círculo (pi = 3.14159), com 4 casas decimais.
 * https://judge.beecrowd.com/pt/problems/view/1002
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1002 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double area, raio, pi;
	raio = sc.nextDouble();
    pi = 3.14159;
    area = (pi * Math.pow(raio, 2));
		
	System.out.printf("%nA = %.4f%n", area);
	
	sc.close();
	}

}
