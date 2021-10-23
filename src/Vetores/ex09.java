package Vetores;

import java.util.Random;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {

		char[] letras = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] vogais = new char[5];
		char[] consantes = new char[21];
		int indexVogais = 0;
		int indexConsoantes = 0;
		for (char letra : letras) {
			if (Vetores.ex05.IsVogal(letra)) {
				vogais[indexVogais++] = letra;
			} else {
				consantes[indexConsoantes++] = letra;
			}
		}

		Scanner input = new Scanner(System.in);

		int tam = letras.length + 1;
		do {
			System.out.print("Digite o tamanho da senha: ");
			tam = input.nextInt();
		} while (tam > letras.length || tam < 1);

		input.close();

		boolean tamIsPar = tam % 2 == 0;

		StringBuilder password = new StringBuilder();
		for (int i = 0; i < tam; i++) {
			if (tamIsPar) {
				if ((i + 1) % 2 == 0) {
					password.append(vogais[getRandomInRange(0, 4)]);
				} else {
					password.append(consantes[getRandomInRange(0, 20)]);
				}
			} else {
				if ((i + 1) % 2 == 0) {
					password.append(consantes[getRandomInRange(0, 20)]);
				} else {
					password.append(vogais[getRandomInRange(0, 4)]);
				}
			}

		}
		
		/*O enunciado diz "A senha gerada deve seguir o padrão
		consoante+vogal para tamanhos pares e consoante+vogal e terminada em consoante para
		tamanhos ímpares." Então assumi vogal+consoante para ímpares*/
		System.out.println("Senha: " + password);

	}

	public static int getRandomInRange(int min, int max) {
		Random random = new Random();
		return random.ints(min, max).findFirst().getAsInt();
	}

}
