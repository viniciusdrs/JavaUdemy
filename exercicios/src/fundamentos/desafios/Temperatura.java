package fundamentos.desafios;

public class Temperatura {
	public static void main(String[] args) {
		// (°F -32) * 5/9 = C°
		double fahre = 86;
		final double FATOR= 5/9.0;
		final int AJUSTE = 32;
		
		 double celsius = (fahre - AJUSTE) * FATOR;
		 System.out.println("O resultado é: " + celsius + "°C.");
		 
		 fahre = 0;
		celsius = (fahre - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "°C.");
	}
}
