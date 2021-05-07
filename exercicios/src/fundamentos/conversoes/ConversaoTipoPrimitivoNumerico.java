package fundamentos.conversoes;

public class ConversaoTipoPrimitivoNumerico {

		public static void main(String[] args) {
			//CAST
			
			double a = 1;// Conversão Implicita
			System.out.println(a);
			
			//Conversão Explicita CAST
			float b = (float)1.123455;// Ou (float b = 1.0F;)
			System.out.println(b);
			
			int c = 50;// Explicita CAST
			byte d = (byte)c;
			System.out.println(d);
			
			double e = 1.999;// Explicita CAST
			int f = (int)e;
			System.out.println(f);
		}
}
