package fundamentos.operadores;

public class Potencia {

		public static void main(String[] args) {
			
			int a =  2 + 3 * 4  ;
			int b = (int)Math.pow(a, 3);
			double c = Math.pow(a, 3);
			
			System.out.println(b);
			System.out.println(c);
		}
}
