package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// Fila trabalha com FIFO(First In First Out)
		
		Queue<String> fila = new LinkedList<>();

		/*
		 * Offer e Add -> adicionam elementos na fila Diferen�a � o comportamento quando
		 * a fila esta cheia
		 */
		// offer -> lan�a uma exce��o
		// add -> retorna false
		fila.add("Vinicius");
		fila.offer("S�o Paulo");
		fila.add("hoje");
		fila.offer("Amanh�");
		fila.add("Ontem");
		fila.offer("Ano");

		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		// peek -> retorna null
		// element -> lan� uma exce��o
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		/*
		 * Diferen�a � o comportamento ocorre quando a fila est� vazia
		 */
		// Poll e Remove -> obter o proximo elemento da fila e romove!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lan�a uma exce��o

		// fila.size(); Tamanho da fila
		// fila.clear(); Limpa a fila
		// fila.isEmpty(); Pergunta se a fila est� vazia
	}
}
