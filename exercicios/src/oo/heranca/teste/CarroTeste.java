package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.CarroNormal;
import oo.heranca.desafio.Ferrari;

public class CarroTeste  {

	public static void main(String[] args) {
		
		Carro c1 = new CarroNormal();
		
		c1.acelerar(c1);
		System.out.println(c1);
		
		c1.acelerar(c1);
		System.out.println(c1);
		
		c1.acelerar(c1);
		System.out.println(c1);
		
		c1.acelerar(c1);
		System.out.println(c1);
		
		c1.frear(c1);
		System.out.println(c1);
		
		c1.frear(c1);
		System.out.println(c1);
		
		c1.frear(c1);
		System.out.println(c1);
		
		c1.frear(c1);
		System.out.println(c1);
		
		
		 Ferrari ferrari = new Ferrari(200);
//		 ferrari.ligarTurbo();
//		 ferrari.ligarAr();
//		 ferrari.desligarAr();
//		 ferrari.desligarTurbo();
		 
		 ferrari.acelerar(ferrari);
		 System.out.println("\n\n" + ferrari);
		 
		 System.out.println(ferrari.velocidadeDoAr());
		 
		 ferrari.acelerar(ferrari);
		 System.out.println(ferrari);
		 
		 
		 ferrari.acelerar(ferrari);
		 System.out.println(ferrari);
		 
		
		 ferrari.frear(ferrari);
		 System.out.println(ferrari);
		 
		 ferrari.frear(ferrari);
		 System.out.println(ferrari);
		 
		 ferrari.frear(ferrari);
		 System.out.println(ferrari);
		 
		 
		
	}
}
