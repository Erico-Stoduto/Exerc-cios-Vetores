package exercicios;

import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		double maior, menor,mediaAlturasMulheres, alturaFemininaTotal;
		int qunatiedadeMulheres, quanatiedadeHomens;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int numero = sc.nextInt();
		double[] alturas = new double[numero];
		char[] generos = new char[numero];

		for (int i = 0; i < numero; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa:");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa:");
			generos[i] = sc.next().toUpperCase().charAt(0);
		}

		maior = alturas[0];
		menor = alturas[0];
		for (int i = 0; i < numero; i++) {
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
		}

		quanatiedadeHomens = 0;
		alturaFemininaTotal = 0;
		qunatiedadeMulheres = 0;
		for (int i = 0; i < numero; i++) {
			if (generos[i] == 'M') {
				quanatiedadeHomens++;
			} else {
				qunatiedadeMulheres++;
				alturaFemininaTotal = alturaFemininaTotal + alturas[i];

			}

		}
		mediaAlturasMulheres = alturaFemininaTotal / qunatiedadeMulheres;
		System.out.printf("Maior altura: %.2f\n", maior);
		System.out.printf("Menor altura: %.2f\n", menor);
		System.out.printf("Média altura das mulheres: %.2f\n", mediaAlturasMulheres);
		System.out.println("Qunatiedade de homens: " + quanatiedadeHomens);

		sc.close();
	}

}
