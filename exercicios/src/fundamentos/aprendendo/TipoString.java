package fundamentos.aprendendo;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Mundo".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.contentEquals("boatarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Vinicius";
		var sobrenome = "Reis";
		var idade = 19;
		

		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade + "\n\n");

		System.out.printf("Nome: %s %s tem %d anos", nome, sobrenome,idade);

	}
}
