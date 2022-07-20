package exercicios;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int numero = sc.nextInt();
		String[] nomes = new String[numero];
		int[] idades = new int[numero];

		for (int i = 0; i < numero; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		int maior = 0;
		int posicaoMaior =0;
		for (int i = 0; i < numero; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posicaoMaior = i;
			}
		}
		
		
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaior]);
		
		sc.close();
	}

}
