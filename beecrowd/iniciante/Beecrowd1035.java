package beecrowd_basico;
import java.util.Scanner;
public class Beecrowd1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (B > C && C > A && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.print("Ok");
        }
        else {
            System.out.print("Noo");
        }


    }
}
