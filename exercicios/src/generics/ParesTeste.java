package generics;

public class ParesTeste {

	public static void main(String[] args) {

		Pares<Integer, String> resultadoConcurso = new Pares<>();

		resultadoConcurso.adicionar(1, "Vinicius");
		resultadoConcurso.adicionar(2, "São Paulo");
		resultadoConcurso.adicionar(3, "Chiefs");
		resultadoConcurso.adicionar(4, "Rockets");
		resultadoConcurso.adicionar(2, "Dodgers");
		resultadoConcurso.adicionar(5, "Golden Knights");

		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}
}
