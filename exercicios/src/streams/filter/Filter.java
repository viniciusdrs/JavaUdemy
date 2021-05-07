package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import streams.Aluno;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Vinicius", 7.8);
		Aluno a2 = new Aluno("São Paulo", 10);
		Aluno a3 = new Aluno("Hoje", 9.8);
		Aluno a4 = new Aluno("Amanhã", 6.8);
		Aluno a5 = new Aluno("Ontem", 5.1);
		Aluno a6 = new Aluno("Campeão", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi Aprovado!";
		
		alunos.stream()
		.filter(aprovado)
		.map(saudacaoAprovado)
		.forEach(System.out::println);
	}
}

