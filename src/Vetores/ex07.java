package Vetores;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] mediaAlunos = new double[10];

		int count;
		double acumuladorNotas = 0;
		for (int index = 0; index < mediaAlunos.length; index++) {
			count = 0;
			acumuladorNotas = 0;
			while (count < 4) {
				System.out.print("Digite a nota número " + ++count + " do aluno " + (index + 1) + ": ");
				acumuladorNotas += input.nextDouble();
			}
			mediaAlunos[index] = acumuladorNotas / 4;
		}
		input.close();

		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("{ | ");
		for (double media : mediaAlunos) {
			if (media >= 7) {
				finalMessage.append(media);
				finalMessage.append(" | ");
			}
		}
		finalMessage.append("}");

		System.out.println(finalMessage);
	}

}
