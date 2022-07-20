package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetorNumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroPar, adicionarPar;
		double mediaPar;
		System.out.print("Quantos elementos vai ter o vetor? ");
		int numero = sc.nextInt();
		int[] vect = new int[numero];

		for (int i = 0; i < numero; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		adicionarPar = 0;
		numeroPar = 0;
		mediaPar = 0;
		for (int i = 0; i < numero; i++) {

			if (vect[i] % 2 == 0) {

				adicionarPar = adicionarPar + vect[i];
				numeroPar++;
			}
		}

		System.out.println();
		if (numeroPar == 0) {
			System.out.println("Nenhum par neste vetor");

		} else {
			mediaPar = adicionarPar / numeroPar;
			System.out.printf("Média dos pares: %.1f\n", mediaPar);
		}

		sc.close();
	}
}
