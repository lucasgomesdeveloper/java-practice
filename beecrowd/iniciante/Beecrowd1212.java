package beecrowd_basico;
import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double raio = sc.nextDouble();
        double raio_esfera = Math.pow(raio, 3);
        double volume_esfera = (4/3.0) * 3.14159 * raio_esfera;
        System.out.printf("VOLUME = %.3f%n", volume_esfera);

        sc.close();



    }
}
