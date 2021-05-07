package arrays.desafios;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		
		double media = 0;
		for(double totalNotas: notas) {
			media += totalNotas;
		}
		System.out.println("\nA média do aluno foi: " + (media / notas.length) + "!");
		

		entrada.close();
	}
}
