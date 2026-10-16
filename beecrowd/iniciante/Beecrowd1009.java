package beecrowd_basico;
import java.util.Scanner;
import java.util.Locale;
public class Beecrowd1009 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    int numero_funcionario = sc.nextInt();
    int horas_trabalhadas  = sc.nextInt();
    double valor_hora = sc.nextDouble();
    double salario = horas_trabalhadas * valor_hora;
    System.out.println("NUMBER: " + numero_funcionario);
    System.out.println("SALARY: " + salario);
		
	sc.close();
	}

}
