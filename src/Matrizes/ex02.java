package Matrizes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex02 {

	static double[][] matrizPrecos = null;
	final static int TAM = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		LeArquivo();
		if (matrizPrecos != null) {
			System.out.println(PrintMatrizFormatada());
			char caracter = ' ';
			do {
				System.out.print("Foi encontrada uma matriz salva! Deseja carregá-la? [S/N]: ");
				caracter = input.next().charAt(0);
			} while (caracter != 'S' && caracter != 'N');
			if (caracter == 'N') {
				matrizPrecos = null;
			}
		}

		if (matrizPrecos == null) {
			matrizPrecos = new double[TAM][TAM];
			for (int i = 0; i < matrizPrecos.length; i++) {
				System.out.println("Supermercado " + (i + 1));
				for (int j = 0; j < matrizPrecos.length; j++) {
					System.out.print(String.format("Digite o valor do produto número %s: ", (j + 1)));
					matrizPrecos[i][j] = input.nextDouble();
				}
			}

		}

		System.out.println();
		System.out.println();

		System.out.println("===== Preços em cada um dos supermercados =====");
		for (int i = 0; i < matrizPrecos.length; i++) {
			System.out.println(String.format("Mercado %s", (i + 1)));
			for (int j = 0; j < matrizPrecos.length; j++) {
				System.out.println(String.format("O produto %s no  é R$%.2f", (j + 1), matrizPrecos[i][j]));
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();

		System.out.println("===== Média de preço por produto =====");
		double mediaPreco;
		for (int i = 0; i < matrizPrecos.length; i++) {
			mediaPreco = 0;
			System.out.println("Produto " + (i + 1));
			for (int j = 0; j < matrizPrecos.length; j++) {
				System.out.print(String.format("Mercado %s R$%.2f ", (j + 1), matrizPrecos[j][i]));
				mediaPreco += matrizPrecos[j][i];
			}
			System.out.println();
			System.out.println(String.format("Média de preço: R$%.2f", (mediaPreco / TAM)));
		}

		System.out.println();
		System.out.println();

		double somaPrecos;
		System.out.println("===== Soma de preços por supermercado =====");
		for (int i = 0; i < matrizPrecos.length; i++) {
			somaPrecos = 0;
			for (int j = 0; j < matrizPrecos.length; j++) {
				somaPrecos += matrizPrecos[i][j];
			}
			System.out.println(String.format("Soma dos preços no mercado %s: R$%.2f", (i + 1), somaPrecos));
		}

		System.out.println();
		System.out.println();
		double maior = 0, menor = 0;
		System.out.println("===== Soma de preços por supermercado =====");
		for (int i = 0; i < matrizPrecos.length; i++) {
			somaPrecos = 0;
			for (int j = 0; j < matrizPrecos.length; j++) {
				somaPrecos += matrizPrecos[i][j];
			}
			if (i == 0) {
				maior = somaPrecos;
				menor = somaPrecos;
			}
			if (somaPrecos > maior) {
				maior = somaPrecos;
			} else if (somaPrecos < menor) {
				menor = somaPrecos;
			}
		}
		System.out.println(String.format("Valor total no supermercado mais barato: R$%.2f", menor));
		System.out.println(String.format("Valor total no supermercado mais caro: R$%.2f", maior));

		char caracter = ' ';
		do {
			System.out.print("Deseja salvar a matriz em um arquivo? [S/N]: ");
			caracter = input.next().charAt(0);
		} while (caracter != 'S' && caracter != 'N');
		if (caracter == 'N') {
			EscreveArquivo();
		}
		input.close();
	}

	public static void LeArquivo() {
		int tamanho;
		BufferedReader leArquivo;
		try {
			String currentDir = new java.io.File(".").getAbsolutePath();
			StringTokenizer leLinhaArquivo;
			String linhaArquivo;
			leArquivo = new BufferedReader(
					new FileReader(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex02.txt")));

			linhaArquivo = leArquivo.readLine();
			leLinhaArquivo = new StringTokenizer(linhaArquivo);
			String firstLine = "";
			for (int index = 0; index < 2; index++) {
				firstLine = leLinhaArquivo.nextToken();
			}
			tamanho = Integer.parseInt(firstLine);
			matrizPrecos = new double[tamanho][tamanho];
			for (int linha = 0; linha < tamanho; linha++) {
				try {
					linhaArquivo = leArquivo.readLine();
					leLinhaArquivo = new StringTokenizer(linhaArquivo);
					for (int coluna = 0; coluna < tamanho; coluna++) {
						matrizPrecos[linha][coluna] = Integer.parseInt(leLinhaArquivo.nextToken());
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
					new FileWriter(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex02.txt")));

			StringBuilder matrizString = new StringBuilder();
			matrizString.append("TAM ");
			matrizString.append(matrizPrecos.length);
			matrizString.append("\n");
			for (int linha = 0; linha < matrizPrecos.length; linha++) {
				for (int coluna = 0; coluna < matrizPrecos.length; coluna++) {
					matrizString.append(matrizPrecos[linha][coluna]);
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

	public static String PrintMatrizFormatada() {
		StringBuilder matrizString = new StringBuilder();

		for (int linha = 0; linha < matrizPrecos.length; linha++) {
			for (int coluna = 0; coluna < matrizPrecos.length; coluna++) {
				matrizString.append("[");
				matrizString.append(matrizPrecos[linha][coluna]);
				matrizString.append("]");
			}
			matrizString.append("\n");
		}
		return matrizString.toString();
	}

}
