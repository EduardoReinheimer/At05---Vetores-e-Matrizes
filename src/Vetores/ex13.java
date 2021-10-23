package Vetores;

import java.util.Scanner;

public class ex13 {

	private static final int PESSOAS = 5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] idades = new int[PESSOAS];
		double[] alturas = new double[PESSOAS];
		int idadeMaisVelho = 0;
		int idadeMaisNovo = 0;
		double alturaMaisAlto = 0;
		double alturaMaisBaixo = 0;
		int acumuladorIdade = 0;
		double acumuladorAltura = 0;

		for (int indice = 0; indice < PESSOAS; indice++) {
			System.out.print("Digite a idade da pessoa " + (indice + 1) + ": ");
			idades[indice] = input.nextInt();
			System.out.print("Digite a altura da pessoa " + (indice + 1) + ": ");
			alturas[indice] = input.nextDouble();

			acumuladorIdade += idades[indice];
			acumuladorAltura += alturas[indice];

			if (indice == 0) {
				idadeMaisNovo = idades[indice];
				idadeMaisVelho = idades[indice];
				alturaMaisAlto = alturas[indice];
				alturaMaisBaixo = alturas[indice];
			}

			if (idades[indice] > idadeMaisVelho) {
				idadeMaisVelho = idades[indice];
			} else if (idades[indice] < idadeMaisVelho) {
				idadeMaisNovo = idades[indice];
			}

			if (alturas[indice] > alturaMaisAlto) {
				alturaMaisAlto = alturas[indice];
			} else if (alturas[indice] < alturaMaisBaixo) {
				alturaMaisBaixo = alturas[indice];
			}
		}
		input.close();

		StringBuilder idadeInversa = new StringBuilder();
		idadeInversa.append("{ ");
		for (int j = idades.length - 1; j >= 0; j--) {
			idadeInversa.append(idades[j]);
			idadeInversa.append(" | ");
		}
		idadeInversa.append("}");

		StringBuilder alturaInversa = new StringBuilder();
		alturaInversa.append("{ ");
		for (int j = alturas.length - 1; j >= 0; j--) {
			alturaInversa.append(alturas[j]);
			alturaInversa.append(" | ");
		}
		alturaInversa.append("}");

		double mediaIdade = acumuladorIdade / PESSOAS;
		double mediaAltura = acumuladorAltura / PESSOAS;

		StringBuilder acimaMediaAltura = new StringBuilder();
		StringBuilder abaixoMediaAltura = new StringBuilder();
		acimaMediaAltura.append("{ | ");
		abaixoMediaAltura.append("{ | ");
		for (double altura : alturas) {
			if (altura < mediaAltura) {
				abaixoMediaAltura.append(altura);
				abaixoMediaAltura.append(" | ");
			} else if (altura > mediaAltura) {
				acimaMediaAltura.append(altura);
				acimaMediaAltura.append(" | ");
			}
		}
		abaixoMediaAltura.append("}");
		acimaMediaAltura.append("}");

		StringBuilder abaixoMediaIdade = new StringBuilder();
		StringBuilder acimaMediaIdade = new StringBuilder();
		abaixoMediaIdade.append("{ | ");
		acimaMediaIdade.append("{ | ");
		for (int idade : idades) {
			if (idade < mediaIdade) {
				abaixoMediaIdade.append(idade);
				abaixoMediaIdade.append(" | ");
			} else if (idade > mediaIdade) {
				acimaMediaIdade.append(idade);
				acimaMediaIdade.append(" | ");
			}
		}
		abaixoMediaIdade.append("}");
		acimaMediaIdade.append("}");

		System.out.println("Idade Inversa: " + idadeInversa);
		System.out.println("Altura Inversa: " + alturaInversa);
		System.out.println("Idade do mais velho: " + idadeMaisVelho);
		System.out.println("Idade do mais novo: " + idadeMaisNovo);
		System.out.println("Altura do mais baixo: " + alturaMaisBaixo);
		System.out.println("Altura do mais alto: " + alturaMaisAlto);
		System.out.println("Abaixo da média de altura: " + abaixoMediaAltura);
		System.out.println("Acima da média de altura: " + abaixoMediaAltura);
		System.out.println("Acima da média da idade: " + acimaMediaIdade);
		System.out.println("Abaixo da média da idade: " + abaixoMediaIdade);

	}

}
