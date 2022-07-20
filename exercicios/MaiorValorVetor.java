package exercicios;

import java.util.Scanner;

public class MaiorValorVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();
		double[] vect = new double[numero];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero:");
			vect[i] = sc.nextDouble();
		}

		double maiorValor = 0;
		double posicaoMaior = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaior = i;
			}

		}

		System.out.println("Maior valor: " + maiorValor);
		System.out.println("Posição do maior valor: " + posicaoMaior);
		sc.close();
	}

}
