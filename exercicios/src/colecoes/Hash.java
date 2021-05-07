package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Vinicius"));
		usuarios.add(new Usuario("São Paulo"));
		usuarios.add(new Usuario("Hoje"));
		
		System.out.println(usuarios.contains(new Usuario("Vinicius")));
		
	}
}
