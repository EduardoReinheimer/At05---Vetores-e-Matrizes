package Vetores;

import java.util.Scanner;

public class ex04 {
	public static final int TAM = 4;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] notas = new double[TAM];

		double acumulador = 0;
		for (int index = 0; index < notas.length; index++) {
			System.out.print("Digite a nota " + (index + 1) + ": ");
			notas[index] = input.nextDouble();
			acumulador += notas[index];
		}

		StringBuilder listaNotas = new StringBuilder();
		listaNotas.append("Notas: { | ");
		for (double nota : notas) {
			listaNotas.append(nota + " | ");
		}
		listaNotas.append("}");
		
		double media = acumulador / TAM;
		
		System.out.println("Média: " + media);
		System.out.println(listaNotas);

		input.close();

	}

}
