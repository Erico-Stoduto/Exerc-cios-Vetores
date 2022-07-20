package exercicios;

import java.util.Scanner;

public class NumerosNegativosDeUmVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar?");
		int numero = sc.nextInt();
		int[] vect = new int[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();

		}
		System.out.println();

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] < 0) {
				System.out.println("Números negativos");
				System.out.printf("%d\n", vect[i]);
			}

		}

		sc.close();
	}

}
