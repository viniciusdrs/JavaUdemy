package classe.desafios;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz" , 0.223);
		Comida c2 = new Comida("Feij�o" , 0.652);
		
		Pessoa p1 = new Pessoa("Jos�" , 79.90);
		Pessoa p2 = new Pessoa("Jo�o" , 20.62);
		
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
		System.out.println(p2.apresentar());
		p2.comer(c1);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println(p2.apresentar());
		
	}
}
