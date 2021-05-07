package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ontem");
		lista.add(u1);
		
		lista.add(new Usuario("S�o Paulo"));
		lista.add(new Usuario("Hoje"));
		lista.add(new Usuario("Amanh�"));
		
		System.out.println(lista.get(3)); // Acessar pelo �ndice
		
		System.out.println(">>>>> " + lista.remove(0));
		System.out.println(lista.remove(new Usuario("Hoje")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("S�o Paulo")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
