package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		// Fila trabalha com FIFO(First In First Out)
		
		Queue<String> fila = new LinkedList<>();

		/*
		 * Offer e Add -> adicionam elementos na fila Diferença é o comportamento quando
		 * a fila esta cheia
		 */
		// offer -> lança uma exceção
		// add -> retorna false
		fila.add("Vinicius");
		fila.offer("São Paulo");
		fila.add("hoje");
		fila.offer("Amanhã");
		fila.add("Ontem");
		fila.offer("Ano");

		// Peek e Element -> obter o proximo elemento da fila (sem remover)
		// peek -> retorna null
		// element -> lanã uma exceção
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());

		/*
		 * Diferença é o comportamento ocorre quando a fila está vazia
		 */
		// Poll e Remove -> obter o proximo elemento da fila e romove!
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lança uma exceção

		// fila.size(); Tamanho da fila
		// fila.clear(); Limpa a fila
		// fila.isEmpty(); Pergunta se a fila está vazia
	}
}
