package exercicios;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int numero = sc.nextInt();
		int[] vectA = new int[numero];
		int[] vectB = new int[numero];
		
		System.out.println("Digite os valores do vetor A:"); 
		for(int i =0; i < numero; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:"); 
		for(int i =0; i < numero; i++) {
			vectB[i] = sc.nextInt();
		}
		System.out.println("Vetor resultante:");
		for(int i =0; i < numero; i++) {
			int soma = vectA[i] + vectB[i];
			System.out.println(soma);
		}
		sc.close();

	}

}
