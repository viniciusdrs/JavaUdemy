package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Vinicius", "Reis", 20);
		p1.setIdade(130);// Alterar
		
		System.out.println(p1.getIdade());// Ler
		System.out.println(p1);// toString
		System.out.println(p1.getnomeCompleto());
	}
}
