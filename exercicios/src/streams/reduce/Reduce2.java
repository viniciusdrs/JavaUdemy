package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import streams.Aluno;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Vinicius", 8.6);
		Aluno a2 = new Aluno("São Paulo", 10);
		Aluno a3 = new Aluno("Hoje", 5.4);
		Aluno a4 = new Aluno("Amanhã", 7.2);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
			
	}
}
