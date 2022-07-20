package exercicios;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somaNotas;
		System.out.println("Quantos alunos serao digitados? ");
		int numero = sc.nextInt();
		String[] nomes = new String[numero];
		int[] notas1 = new int[numero];
		int[] notas2 = new int[numero];

		for (int i = 0; i < numero; i++) {

			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno: ");
			nomes[i] = sc.next();
			notas1[i] = sc.nextInt();
			notas2[i] = sc.nextInt();
		}

		somaNotas = 0;
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < numero; i++) {
			somaNotas = notas1[i] + notas2[i];
			if (somaNotas >= 6) {
				System.out.println(nomes[i]);

			}
		}
		
		System.out.println();
		System.out.println("Alunos reprovados: ");
		for (int i = 0; i < numero; i++) {
			somaNotas = notas1[i] + notas2[i];
			if (somaNotas < 6) {
				System.out.println(nomes[i]);

			}
		}
		sc.close();
	}

}
