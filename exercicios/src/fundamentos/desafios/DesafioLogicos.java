package fundamentos.desafios;

public class DesafioLogicos {

		public static void main(String[] args) {
			
			boolean trabalho1 = false;
			boolean trabalho2 = false;
			
			boolean tv50 = trabalho1 && trabalho2;
			boolean tv32 = trabalho1 ^ trabalho2;
			boolean sorvete  = trabalho1 || trabalho2;
			
			
			System.out.println("Comprou Tv 50\"? " + tv50);
			System.out.println("Comprou Tv 32\"? " + tv32);
			System.out.println("Comprou Sorvete? " + sorvete);
			System.out.println("Mais saudável? " + !sorvete);
			
			
			
		}
}
