package Matrizes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {
	static int[][] matrizNumeros = null;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tamanho = 0;

		LeArquivo();

		if (matrizNumeros != null) {
			System.out.println(PrintMatrizFormatada());
			char caracter = ' ';
			do {
				System.out.print("Foi encontrada uma matriz salva! Deseja carregá-la? [S/N]: ");
				caracter = input.next().charAt(0);
			} while (caracter != 'S' && caracter != 'N');
			if (caracter == 'N') {
				matrizNumeros = null;
				EscreveArquivo();
			}
		}
		if (matrizNumeros == null) {
			// Pega tamanho e cria matriz
			do {
				System.out.print("Digite o tamanho: ");
				tamanho = input.nextInt();
			} while (tamanho % 2 == 0 || (tamanho > 11 || tamanho < 3));

			matrizNumeros = new int[tamanho][tamanho];

			for (int linha = 0; linha < tamanho; linha++) {
				for (int coluna = 0; coluna < tamanho; coluna++) {
					System.out.print(String.format("Digite o número do elemento [%s][%s]: ", linha, coluna));
					matrizNumeros[linha][coluna] = input.nextInt();
				}
			}

			input.close();
		}

		int soma = 0;
		int maiorValor = 0;
		int menorValor = 0;
		int countPares = 0;
		int countImpares = 0;
		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
				// Soma dos elementos
				soma += matrizNumeros[linha][coluna];

				// Maior e menor
				if (linha == 0 && coluna == 0) {
					maiorValor = matrizNumeros[linha][coluna];
					menorValor = matrizNumeros[linha][coluna];
				}
				if (matrizNumeros[linha][coluna] > maiorValor) {
					maiorValor = matrizNumeros[linha][coluna];
				} else if (matrizNumeros[linha][coluna] < menorValor) {
					menorValor = matrizNumeros[linha][coluna];
				}

				// Contador de pares e ímpares
				if (matrizNumeros[linha][coluna] % 2 == 0) {
					countPares++;
				} else {
					countImpares++;
				}
			}
		}

		// Media
		double media = (double) soma * tamanho * tamanho;

		System.out.print(PrintMatrizFormatada());
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior valor" + maiorValor);
		System.out.println("Menor valor" + menorValor);
		System.out.println("Pares: " + countPares);
		System.out.println("Ímpares: " + countImpares);
		System.out.println("Soma da diagonal principal: " + calculaDiagonalPrincipal(matrizNumeros));
		System.out.println("Soma da diagonal secundária;"+ calculaDiagonalSecundaria(matrizNumeros));

		char caracter = ' ';
		do {
			System.out.print("Deseja salvar a matriz em um arquivo? [S/N]: ");
			caracter = input.next().charAt(0);
		} while (caracter != 'S' && caracter != 'N');
		if (caracter == 'N') {
			EscreveArquivo();
		}

	}

	public static String PrintMatrizFormatada() {
		StringBuilder matrizString = new StringBuilder();

		for (int linha = 0; linha < matrizNumeros.length; linha++) {
			for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
				matrizString.append("[");
				matrizString.append(matrizNumeros[linha][coluna]);
				matrizString.append("]");
			}
			matrizString.append("\n");
		}
		return matrizString.toString();
	}

	public static void LeArquivo() {
		int tamanho;
		BufferedReader leArquivo;
		try {
			String currentDir = new java.io.File(".").getAbsolutePath();
			StringTokenizer leLinhaArquivo;
			String linhaArquivo;
			leArquivo = new BufferedReader(
					new FileReader(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex01.txt")));

			linhaArquivo = leArquivo.readLine();
			leLinhaArquivo = new StringTokenizer(linhaArquivo);
			String firstLine = "";
			for (int index = 0; index < 2; index++) {
				firstLine = leLinhaArquivo.nextToken();
			}
			tamanho = Integer.parseInt(firstLine);
			matrizNumeros = new int[tamanho][tamanho];
			for (int linha = 0; linha < tamanho; linha++) {
				try {
					linhaArquivo = leArquivo.readLine();
					leLinhaArquivo = new StringTokenizer(linhaArquivo);
					for (int coluna = 0; coluna < tamanho; coluna++) {
						matrizNumeros[linha][coluna] = Integer.parseInt(leLinhaArquivo.nextToken());
					}
				} catch (IOException e) {
				}
			}
			leArquivo.close();
		} catch (Exception e) {
			System.err.println("Arquivo de referência não encontrado");
		}
	}

	public static void EscreveArquivo() {
		BufferedWriter escreveArquivo;
		try {
			String currentDir = new java.io.File(".").getAbsolutePath();
			escreveArquivo = new BufferedWriter(
					new FileWriter(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex01.txt")));

			StringBuilder matrizString = new StringBuilder();
			matrizString.append("TAM ");
			matrizString.append(matrizNumeros.length);
			matrizString.append("\n");
			for (int linha = 0; linha < matrizNumeros.length; linha++) {
				for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
					matrizString.append(matrizNumeros[linha][coluna]);
					matrizString.append(" ");
				}
				matrizString.append("\n");
			}
			escreveArquivo.write(matrizString.toString());
			escreveArquivo.close();
		} catch (IOException e) {
			System.err.println("Arquivo de referência não encontrado");
		}
	}

	public static int calculaDiagonalPrincipal(int[][] matriz) {
		int diagonalPrincipal = 0;
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (linha == coluna) {
					diagonalPrincipal += matriz[linha][coluna];
				}
			}
		}
		return diagonalPrincipal;
	}

	public static int calculaDiagonalSecundaria(int[][] matriz) {
		int diagonalSecundaria = 0;
		for (int linha = matriz.length - 1; linha >= 0; linha--) {
			for (int coluna = matriz.length - 1; coluna >= 0; coluna--) {
				if (linha + coluna == matriz.length - 1) {
					diagonalSecundaria += matriz[linha][coluna];
				}
			}
		}
		return diagonalSecundaria;
	}

}
