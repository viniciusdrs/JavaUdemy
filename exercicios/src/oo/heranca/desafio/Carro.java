package oo.heranca.desafio;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	
	
	public int getDelta() {
		return delta;
	}




	public void setDelta(int delta) {
		this.delta = delta;
	}




	public void acelerar(Carro carro) {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
		velocidadeAtual += getDelta();
		}
	}
	
	 public void frear(Carro carro ) {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
		
		}
	public String toString() {
		return "Velocidade do Carro Normal => " + velocidadeAtual + " Km/h.";
}
	
}