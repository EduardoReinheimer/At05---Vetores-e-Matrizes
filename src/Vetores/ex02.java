package Vetores;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o valor do vetor de posição " + (i + 1) + ": ");
			vetor[i] = input.nextInt();
		}
		
		input.close();

		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}

}
