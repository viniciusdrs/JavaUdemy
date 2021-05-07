package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		//	Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Lista");
		lista.add("Vinicius");
		lista.add("São Paulo");
		lista.add("Java");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
	
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
