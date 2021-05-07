package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner salarios = new Scanner(System.in);

		System.out.print("Digite o salario do 1° Mês: ");
		String salario1 = salarios.next().replace(",", ".");

		System.out.print("Digite o salario do 2° Mês: ");
		String salario2 = salarios.next().replace(",", ".");

		System.out.print("Digite o salario do 3° Mês: ");
		String salario3 = salarios.next().replace(",", ".");

		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		double mediaSalario = (valor1 + valor2 + valor3) / 3;

		System.out.println("\nA média do salário é: " + mediaSalario);

		salarios.close();
	}
}
