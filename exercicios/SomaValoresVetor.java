package exercicios;

import java.util.Scanner;

public class SomaValoresVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma, media;
		System.out.print("Quantos n�meros voce vai digitar? ");
		int numero = sc.nextInt();
		double[] vect = new double[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um n�mero:");
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
		System.out.printf("M�dia = %.2f\n", media);

		sc.close();
	}

}
