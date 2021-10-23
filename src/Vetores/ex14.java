package Vetores;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] vetoresMescla = new int[20];

		for (int i = 0; i < vetor1.length; i++) {
			System.out.print("Digite um número para o primeiro vetor: ");
			vetor1[i] = input.nextInt();
		}

		for (int i = 0; i < vetor2.length; i++) {
			System.out.print("Digite um número para o segundo vetor: ");
			vetor2[i] = input.nextInt();
		}
		
		input.close();
		
		alternateMerge(vetor1, vetor2, vetor1.length, vetor2.length, vetoresMescla);

		for (int item : vetoresMescla) {
			System.out.println(item);
		}

	}

	public static int[] alternateMerge(int vetor1[], int vetor2[], int indexVetor1, int indexVetor2, int vetorSoma[]) {
		int i = 0, j = 0, k = 0;

		while (i < indexVetor1 && j < indexVetor2) {
			vetorSoma[k++] = vetor1[i++];
			vetorSoma[k++] = vetor2[j++];
		}

		while (i < indexVetor1)
			vetorSoma[k++] = vetor1[i++];

		while (j < indexVetor2)
			vetorSoma[k++] = vetor2[j++];

		return vetorSoma;
	}

}
