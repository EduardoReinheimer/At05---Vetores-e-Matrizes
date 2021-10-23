package Vetores;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = input.next();
		
		input.close();
		
		String [] letrasDoTexto = texto.split("");
		
		StringBuilder finalMessage = new StringBuilder();
		finalMessage.append("{ | "); 
		for (int index = 0; index < letrasDoTexto.length; index++) {
			finalMessage.append(letrasDoTexto[index]);
			finalMessage.append(" | ");
		}
		finalMessage.append("}");
		System.out.println(finalMessage);

	}

}
