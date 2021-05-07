package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("informe o número: ");
			double num1 = entrada.nextDouble();
			
			System.out.println("informe o número: ");
			double num2 = entrada.nextDouble();
			
			System.out.println("Digite qual operação deseja efetuar: "+ "\n"+"(+) (-) (*) (/) (%)");
			String operacao = entrada.next();
			
			double resultado = "+".equals(operacao) ? num1 + num2 : "-".equals(operacao) ? num1 - num2 :
				"*".equals(operacao) ? num1 * num2 : "/".equals(operacao) ? num1 / num2 :
					"%".equals(operacao) ? num1 % num2 : 0 ;
			
			System.out.printf("%.2f %s %.2f = %.2f" , num1, operacao, num2, resultado);
			
			
			
			entrada.close();
		}
}
