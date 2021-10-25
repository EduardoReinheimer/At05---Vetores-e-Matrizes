package Matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class ex02 {

	static double[][] matrizPrecos = null;
	final static int TAM = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		matrizPrecos = new double[TAM][TAM];

		for (int i = 0; i < matrizPrecos.length; i++) {
			System.out.println("Supermercado " + (i + 1));
			for (int j = 0; j < matrizPrecos.length; j++) {
				System.out.println(String.format("Digite o valor do produto número %s: ", (j + 1)));
				matrizPrecos[i][j] = input.nextDouble();
			}
		}

		System.out.println("===== Média de preço por produto =====");
		double mediaPreco;
		for (int i = 0; i < matrizPrecos.length; i++) {
			mediaPreco = 0;
			System.out.println("Produto " + (i + 1));
			for (int j = 0; j < matrizPrecos.length; j++) {
				System.out.print("R$" + matrizPrecos[j][i] + " ");
				mediaPreco += matrizPrecos[j][i];
			}
			System.out.println();
			System.out.println(String.format("Média de preço: R$%.2f", (mediaPreco / TAM)));
		}
		

	}

//	public static void LeArquivo() {
//		int tamanho;
//		BufferedReader leArquivo;
//		try {
//			String currentDir = new java.io.File(".").getAbsolutePath();
//			StringTokenizer leLinhaArquivo;
//			String linhaArquivo;
//			leArquivo = new BufferedReader(
//					new FileReader(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex02.txt")));
//
//			linhaArquivo = leArquivo.readLine();
//			leLinhaArquivo = new StringTokenizer(linhaArquivo);
//			String firstLine = "";
//			for (int index = 0; index < 2; index++) {
//				firstLine = leLinhaArquivo.nextToken();
//			}
//			tamanho = Integer.parseInt(firstLine);
//			matrizNumeros = new double[tamanho][tamanho];
//			for (int linha = 0; linha < tamanho; linha++) {
//				try {
//					linhaArquivo = leArquivo.readLine();
//					leLinhaArquivo = new StringTokenizer(linhaArquivo);
//					for (int coluna = 0; coluna < tamanho; coluna++) {
//						matrizNumeros[linha][coluna] = Integer.parseInt(leLinhaArquivo.nextToken());
//					}
//				} catch (IOException e) {
//				}
//			}
//			leArquivo.close();
//		} catch (Exception e) {
//			System.err.println("Arquivo de referência não encontrado");
//		}
//	}
//
//	public static void EscreveArquivo() {
//		int tamanho;
//		BufferedWriter escreveArquivo;
//		try {
//			String currentDir = new java.io.File(".").getAbsolutePath();
//			StringTokenizer leLinhaArquivo;
//			String linhaArquivo;
//			escreveArquivo = new BufferedWriter(
//					new FileWriter(String.format("%s/%s", currentDir, "\\arquivos\\Matrizes\\ex02.txt")));
//
//			StringBuilder matrizString = new StringBuilder();
//			matrizString.append("TAM ");
//			matrizString.append(matrizNumeros.length);
//			matrizString.append("\n");
//			for (int linha = 0; linha < matrizNumeros.length; linha++) {
//				for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
//					matrizString.append(matrizNumeros[linha][coluna]);
//					matrizString.append(" ");
//				}
//				matrizString.append("\n");
//			}
//			escreveArquivo.write(matrizString.toString());
//			escreveArquivo.close();
//		} catch (IOException e) {
//			System.err.println("Arquivo de referência não encontrado");
//		}
//	}

}
