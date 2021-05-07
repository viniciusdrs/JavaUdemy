package arrays;

import java.util.Arrays;

public class ExercicioForeach {

public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		
		double mediaAlunoA = 0;
		for(double totalAlunoA: notasAlunoA) {
			mediaAlunoA += totalAlunoA;
		}
		System.out.println( mediaAlunoA / notasAlunoA.length);
		
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double mediaAlunoB = 0;
		for (double totalAlunoB: notasAlunoB) {
			mediaAlunoB += totalAlunoB;
		}
		System.out.println(mediaAlunoB / notasAlunoB.length);
	}
}