package controle.exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = entrada.nextInt();

		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				System.out.println("O numero " + num + " esta entre 0 e 10 e � par");
			} else {
				System.out.println("O numero " + num + " esta entre 0 e 10 e n�o � par");
			}
		} else
			System.out.println("O numero " + num + " n�o est� entre 0 e 10");

		entrada.close();
	}
}
