package Vetores;

import java.util.Scanner;

public class ex03 {
	// Constante que define o tamanho do vetor
	public static final int TAM = 5;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetorNumeros = new int[TAM];

		int maior = 0;
		int menor = 0;
		double soma = 0;
		int countPar = 0;
		int countImpar = 0;
		for (int index = 0; index < vetorNumeros.length; index++) {
			System.out.print("Digite o valor do vetor de posição " + (index + 1) + ": ");
			vetorNumeros[index] = input.nextInt();

			// Conta pares e ímpares
			if (vetorNumeros[index] % 2 == 0) {
				countPar++;
			} else {
				countImpar++;
			}

			// soma
			soma += vetorNumeros[index];

			// maiores e menores
			if (index == 0) {
				menor = vetorNumeros[index];
				maior = vetorNumeros[index];
			} else {
				if (maior < vetorNumeros[index]) {
					maior = vetorNumeros[index];
				}
				if (menor > vetorNumeros[index]) {
					menor = vetorNumeros[index];
				}
			}
		}
		input.close();

		double media = soma / TAM;

		int[] pares = new int[countPar];
		int[] impares = new int[countImpar];

		int maiorQueMediaCount = 0;
		int menorQueMediaCount = 0;
		int indexPar = 0;
		int indexImpar = 0;
		int naMediaCount = 0;
		for (int index = 0; index < vetorNumeros.length; index++) {
			if (vetorNumeros[index] % 2 == 0) {
				pares[indexPar++] = vetorNumeros[index];
			} else {
				impares[indexImpar++] = vetorNumeros[index];
			}

			if (vetorNumeros[index] > media) {
				maiorQueMediaCount++;
			} else if (vetorNumeros[index] < media) {
				menorQueMediaCount++;
			} else {
				naMediaCount++;
			}
		}

		int[] maioresQueMedia = new int[maiorQueMediaCount];
		int[] menoresQueMedia = new int[menorQueMediaCount];
		int[] naMedia = new int[naMediaCount];
		int indexMaiores = 0;
		int indexMenores = 0;
		int indexNaMedia = 0;
		for (int index = 0; index < vetorNumeros.length; index++) {
			if (vetorNumeros[index] > media) {
				maioresQueMedia[indexMaiores++] = vetorNumeros[index];
			} else if (vetorNumeros[index] < media) {
				menoresQueMedia[indexMenores++] = vetorNumeros[index];
			} else {
				naMedia[indexNaMedia++] = vetorNumeros[index];
			}
		}

		StringBuilder listaPares = new StringBuilder();
		listaPares.append("Pares: { ");
		for (int par : pares) {
			listaPares.append(par);
			listaPares.append(" ");
		}
		listaPares.append("}");

		StringBuilder listaImpares = new StringBuilder();
		listaImpares.append("Ímpares: { ");
		for (int impar : impares) {
			listaImpares.append(impar);
			listaImpares.append(" ");
		}
		listaImpares.append("}");

		StringBuilder listaMaioresQueMedia = new StringBuilder();
		listaMaioresQueMedia.append("Maiores que a média: { ");
		for (int maiorQueMedia : maioresQueMedia) {
			listaMaioresQueMedia.append(maiorQueMedia);
			listaMaioresQueMedia.append(" ");
		}
		listaMaioresQueMedia.append("}");

		StringBuilder listaMenoresQueMedia = new StringBuilder();
		listaMenoresQueMedia.append("Menores que a média: { ");
		for (int menorQueMedia : menoresQueMedia) {
			listaMenoresQueMedia.append(menorQueMedia + " ");
		}
		listaMenoresQueMedia.append("}");

		StringBuilder listaNaMedia = new StringBuilder();
		listaNaMedia.append("Números iguais a média: { ");
		for (int naMediaNum : naMedia) {
			listaNaMedia.append(naMediaNum);
			listaNaMedia.append(" ");
		}
		listaNaMedia.append("}");

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println(listaPares);
		System.out.println(listaImpares);
		System.out.println(listaMaioresQueMedia);
		System.out.println(listaMenoresQueMedia);
		System.out.println(listaNaMedia);
	}

}
