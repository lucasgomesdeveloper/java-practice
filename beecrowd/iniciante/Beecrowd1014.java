package beecrowd_basico;
import java.util.Scanner;
import java.util.Locale;
public class Beecrowd1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.printf("%d eh o maior%n", maior);

    }
}
