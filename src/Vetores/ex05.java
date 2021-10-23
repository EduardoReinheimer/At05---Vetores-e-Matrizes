package Vetores;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		char[] caracteres = new char[10];

		int consoantesCount = 0;		
		
		for (int index = 0; index < caracteres.length; index++) {
			System.out.print("Digite o caracter " + (index + 1) + ": ");
			caracteres[index] = input.next().charAt(0);
			if(!IsVogal(caracteres[index])) {
				consoantesCount++;
			}
		}
		
		input.close();

		char [] consoantes = new char [consoantesCount];
		int consoantesIndex = 0;
		for (int index = 0; index < caracteres.length; index++) {
			if(!IsVogal(caracteres[index])) {
				consoantes[consoantesIndex++] = caracteres[index];
			}
		}
		
		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("Foram coletadas ");
		finalMessage.append(consoantesCount);
		finalMessage.append(" consoantes. \nConsoantes: {");
		for(char consoante: consoantes) {
			finalMessage.append(consoante);
			finalMessage.append(" ");
		}
		finalMessage.append("}");
		
		System.out.println(finalMessage);
	}

	public static boolean IsVogal(char digit) {
		switch (Character.toUpperCase(digit)) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}

	}

}
