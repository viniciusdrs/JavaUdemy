package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;
	private String sobrenome;
	
	


	public Pessoa(String nome, String sobrenome, int idade) {
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//////////////////////////////////////////////////////////////////////////////////////
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getnomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

////////////////////////////////////////////////////////////////////////////////////////
	// Getter
	public  int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int NovaIdade) {
		NovaIdade = Math.abs(NovaIdade);
		if(NovaIdade >= 0 && NovaIdade <= 120) {
			this.idade = NovaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}
}
