package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Computadores c1 = new Computadores("Samsumg", 1.900, "Windows");
		Computadores c2 = new Computadores("Apple", 3.900, "MAC");
		Computadores c3 = new Computadores("LG", 1.530, "Linux");
		Computadores c4 = new Computadores("DELL", 2.500, "Windows");
		Computadores c5 = new Computadores("HP", 2.000, "Linux");
		Computadores c6 = new Computadores("Lenovo", 1.900, "Windows");
		Computadores c7 = new Computadores("Apple", 4.000, "MAC");
		
		List<Computadores> computador = Arrays.asList(c1, c2, c3, c4, c5, c6, c7);
		
		Predicate<Computadores> preco = p -> p.preco >= 2.000;
		Predicate<Computadores> sistema = s -> s.sistemaOperacional.equalsIgnoreCase("windows");
		Function<Computadores, String> mensagem = m -> "Seu computador de marca: " + m.marca + ", tem Sistema Operacional: " + m.sistemaOperacional;
	
		computador.stream()
		.filter(preco)
		.filter(sistema)
		.map(mensagem)
		.forEach(System.out::println);
	
	}

}
