package Vetores;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[5];

		int acumuladorSoma = 0;
		int acumuladorMultiplicacao = 1;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número de posição " + (i + 1) + ": ");
			numeros[i] = input.nextInt();
			acumuladorSoma += numeros[i];
			acumuladorMultiplicacao *= numeros[i];
		}
		input.close();

		System.out.println("Soma: " + acumuladorSoma);
		System.out.println("Multiplicação: " + acumuladorMultiplicacao);

	}

}
