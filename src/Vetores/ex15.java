package Vetores;

import java.util.Scanner;

public class ex15 {
	private static final int ALUNOS = 30;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] idades = new int[ALUNOS];
		double[] alturas = new double[ALUNOS];
		double acumuladorAltura = 0;

		for (int indice = 0; indice < ALUNOS; indice++) {
			System.out.print("Digite a idade do aluno " + (indice + 1) + ": ");
			idades[indice] = input.nextInt();
			System.out.print("Digite a altura do aluno " + (indice + 1) + ": ");
			alturas[indice] = input.nextDouble();

			acumuladorAltura += alturas[indice];
		}

		double mediaAltura = acumuladorAltura / ALUNOS;

		input.close();

		int count = 0;
		for (int indice = 0; indice < ALUNOS; indice++) {
			if (idades[indice] > 13 && alturas[indice] > mediaAltura) {
				count++;
			}
		}

		System.out.println(count + " alunos com mais de 13 anos possuem altura inferior à média de altura");

	}

}
