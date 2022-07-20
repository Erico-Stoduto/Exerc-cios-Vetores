package exercicios;

import java.util.Scanner;

public class SomaValoresVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma, media;
		System.out.print("Quantos números voce vai digitar? ");
		int numero = sc.nextInt();
		double[] vect = new double[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextDouble();

		}
		soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];

		}

		media = soma / numero;

		System.out.print("Valores = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f  ", vect[i]);

		}
		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Média = %.2f\n", media);

		sc.close();
	}

}
