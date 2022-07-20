package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double mediaVetor;
		System.out.print("Quantos valores vai ter cada vetor? ");
		int numero = sc.nextInt();
		double[] vect = new double[numero];
		
		
		for (int i = 0; i < numero; i++) {
			System.out.print("Digite um numero:");
			vect[i] = sc.nextDouble();

		}
		mediaVetor = 0;
		System.out.print("Média do vetor: ");
		for(int i = 0; i < numero; i++) {
			mediaVetor = mediaVetor + vect[i] / vect.length;
		}
		 System.out.printf("%.2f\n",mediaVetor);
		
		System.out.println("Elementos abaixo da média: ");
		for(int i = 0; i < numero; i++) {
			if(vect[i] < mediaVetor) {
				System.out.printf("%.2f\n",vect[i]);
			}
		}
		
		

		sc.close();

	}

}
