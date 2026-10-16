package beecrowd_basico;

/*
 * Beecrowd 1012 - Área
 * Lê A, B e C e calcula as áreas de triângulo retângulo, círculo,
 * trapézio, quadrado e retângulo, imprimindo com 3 casas decimais.
 * https://judge.beecrowd.com/pt/problems/view/1012
 */

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1013 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A,B,C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double area_trianguloretangulo = (A * C) / 2;
        double Cpotencia = Math.pow(C,2);
        double area_circulo = (3.14159 * Cpotencia);
        double area_trapezio = ((A + B) * C) / 2;
        double area_quadrado = (B * B);
        double  area_retangulo = (A * B);
        System.out.printf("TRIANGULO: %.3f%n", area_trianguloretangulo);
        System.out.printf("CIRCULO: %.3f%n", area_circulo);
        System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
        System.out.printf("QUADRADO: %.3f%n", area_quadrado);
        System.out.printf("RETANGULO: %.3f%n", area_retangulo);

    }
}
