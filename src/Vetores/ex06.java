package Vetores;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = new int[20];

		int countPar = 0;
		int countImpar = 0;
		for (int index = 0; index < numeros.length; index++) {
			System.out.print("Digite o valor do vetor de posição " + (index + 1) + ": ");
			numeros[index] = input.nextInt();
			if (numeros[index] % 2 == 0) {
				countPar++;
			} else {
				countImpar++;
			}
		}
		input.close();

		int PARES[] = new int[countPar];
		int IMPARES[] = new int[countImpar];
		int indexPar = 0;
		int indexImpar = 0;

		for (int numero : numeros) {
			if (numero % 2 == 0) {
				PARES[indexPar++] = numero;
			} else {
				IMPARES[indexImpar++] = numero;
			}
		}

		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("Números digitados: { ");
		for (int numero : numeros) {
			finalMessage.append(numero);
			finalMessage.append(" ");
		}
		finalMessage.append("} \nPares: { ");
		for (int par : PARES) {
			finalMessage.append(par);
			finalMessage.append(" ");
		}
		finalMessage.append("} \n Ímpares: { ");
		for (int impar : IMPARES) {
			finalMessage.append(impar);
			finalMessage.append(" ");
		}
		finalMessage.append("}");

		System.out.println();
		System.out.println(finalMessage);
	}

}
