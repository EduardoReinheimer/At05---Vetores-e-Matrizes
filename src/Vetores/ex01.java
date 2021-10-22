package Vetores;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] vetor = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o valor do vetor de posição " + (i+1) + ": ");
			vetor[i] = input.nextInt();
		}
		
		input.close();
		
		for(int i: vetor) {
			System.out.println(i);
		}
		

	}

}
