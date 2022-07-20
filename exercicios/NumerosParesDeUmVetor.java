package exercicios;

import java.util.Scanner;

public class NumerosParesDeUmVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroPar = 0;
		int quantiedadePares = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		int[] vect = new int[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextInt();

		}

		System.out.print("Números pares: ");
		quantiedadePares = 0;
		for (int i = 0; i < vect.length; i++) {
			numeroPar = vect[i] / 2 * 2;
			if (numeroPar == vect[i]) {
				System.out.print(numeroPar + " ");
				quantiedadePares++;
			}
		}
		System.out.println();

		System.out.print("Quantiedade de pares: ");
		System.out.printf("\n\nQuantiedade de pares = %d\n", quantiedadePares);
		sc.close();
	}

}
