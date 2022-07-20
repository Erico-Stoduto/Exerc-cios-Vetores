package exercicios;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		double alturaMedia, menores, porcentageMenores;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		String[] nomes = new String[numero];
		int[] idades = new int[numero];
		double[] alturas = new double[numero];

		for (int i = 0; i < numero; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();

		}

		alturaMedia = 0;
		menores = 0;
		porcentageMenores = 0;
		for (int i = 0; i < numero; i++) {
			alturaMedia = alturaMedia + alturas[i] / alturas.length;
			if (idades[i] < 16) {
				menores++;
				porcentageMenores = menores * 100 / numero;

			}

		}

		System.out.println("Altura média: " + alturaMedia);
		System.out.println("Pessoas com menos de 16 anos: " + porcentageMenores + "%");
		for (int i = 0; i < numero; i++) {
			if (idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		sc.close();
	}

}
