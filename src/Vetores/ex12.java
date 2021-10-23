package Vetores;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma lista de palavras separadas por ; :");
		String texto = input.next();
		
		input.close();
		
		String [] lista = texto.split(";");
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(String.format("[%s] = %s", i, lista[i]));
		}

	}

}
