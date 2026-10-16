package beecrowd_basico;

import java.util.Scanner;
import java.util.Locale;

public class Beecrowd1008 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
    String nome_funcionario;
    nome_funcionario = sc.nextLine();
    double salario_fixo;
    salario_fixo = sc.nextDouble();
    int total_vendas;
    total_vendas = sc.nextInt();
    
    double total_salario = (total_vendas * 15) / 100 + salario_fixo;
    
    System.out.println("TOTAL = "+ total_salario);
    
	sc.close();
	

	}

}
