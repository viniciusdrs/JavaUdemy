package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Vinicius", 8.6);
		Aluno a2 = new Aluno("São Paulo", 10);
		Aluno a3 = new Aluno("Hoje", 5.4);
		Aluno a4 = new Aluno("Amanhã", 7.2);
		Aluno a5 = new Aluno("Chiefs", 8.6);
		Aluno a6 = new Aluno("São Paulo", 10);
		Aluno a7 = new Aluno("Rockets", 5.4);
		Aluno a8 = new Aluno("Campeão", 7.2);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
			
		System.out.println("\ntakeWhile");
		alunos.stream()
			.distinct()
			//.skip(3)
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);

		}
}
