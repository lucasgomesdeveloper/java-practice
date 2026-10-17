package beecrowd_basico;

/*
 * Beecrowd 1009 - Salário
 * Lê nome do funcionário, salário fixo e total de vendas.
 * Calcula o salário final: fixo + 15% sobre o total de vendas.
 * https://judge.beecrowd.com/pt/problems/view/1009
 */

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
