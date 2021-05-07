package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos("Notebook", 2500, 0.35, 0);
		Produtos p2 = new Produtos("SmartPhone", 1800, 0.1, 15.30);
		Produtos p3 = new Produtos("Smart TV", 6500, 0.35, 0);
		Produtos p4 = new Produtos("Apple Watch", 1200, 0.046, 25.50);
		Produtos p5 = new Produtos("Geladeira", 5500, 0.15, 150);
		Produtos p6 = new Produtos("Impressora", 2000, 0.46, 0);
		Produtos p7 = new Produtos("Iphone", 4000, 0.20, 0);
		
		List<Produtos> produto =  Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<Produtos> desconto = p -> p.desconto >= 0.3;
		Predicate<Produtos> frete = f -> f.frete == 0;
		Function<Produtos, String> mensagem = 
				m -> "Aproveite! " + m.nome + " por apenas R$" + m.preco;
		
		produto.stream()
		.filter(desconto)
		.filter(frete)
		.map(mensagem)
		.forEach(System.out::println);
	}

}
