package Vetores;

import java.util.Scanner;

public class ex16 {
	private static final int TAM = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[TAM];
		int value = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um valor: ");

			do {
				value = numeros[i] = input.nextInt();
			} while (value < 0 || value > 20);

		}
		input.close();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < numeros.length; i++) {
			builder.append(numeros[i]);
			builder.append(": ");
			for (int j = 0; j < numeros[i]; j++) {
				builder.append("#");
			}
			System.out.println(builder);
			builder = new StringBuilder();
		}

	}

}
