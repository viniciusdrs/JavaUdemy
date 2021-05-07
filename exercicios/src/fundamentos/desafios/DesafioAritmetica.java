package fundamentos.desafios;

public class DesafioAritmetica {

		public static void main(String[] args) {
			// 1° forma que eu fiz
			
			double dividendo1 = 6*(3+2);
			double resultado1 = Math.pow(dividendo1,2)/6;
			
			double dividendo2 = (1-5)*(2-7)/2;
			double resultado2 = Math.pow(dividendo2,2);
			
			double dividendoPrincipal = (resultado1 - resultado2);
			dividendoPrincipal =Math.pow(dividendoPrincipal, 3);
			
			double divisorGeral = Math.pow(10, 3);
			
			double resultado = dividendoPrincipal/divisorGeral;
			
			System.out.println("O resultado da 1° vez: " + resultado);
			
////////////////////////////////////////////////////////////////////////////////////////////////
			// 2° Forma que eu fiz mais Simplificada
			
			double resul1 = Math.pow((6*(3+2)), 2)/6;
			
			double resul2 = Math.pow((1-5)*(2-7)/2, 2);
			
			double resulGeral = Math.pow(resul1-resul2,3)/Math.pow(10,3);
			
			System.out.println("\n\nResultado da 2° vez mais simplificada: " + resulGeral);
		}
}
