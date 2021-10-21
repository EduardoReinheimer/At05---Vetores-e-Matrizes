import java.util.Scanner;

public class ex03 {
	public static final int N = 3;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Define vetor
		int[] vetor = new int[N];

		// Preenche vetor
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o valor do vetor de posição " + (i + 1) + ": ");
			vetor[i] = input.nextInt();
		}
		input.close();

		// Gera a soma dos números
		double soma = 0;
		for (int i : vetor) {
			soma += i;
		}
		System.out.println("Soma: " + soma);

		// Média
		double media = soma / N;
		System.out.println("Média: " + media);
		
		//Maior e Menor
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if(i == 0) {
				menor = vetor[i];
				maior = vetor[i];
			} else {
				if (maior < vetor[i]) {
					maior = vetor[i];
				} 
				if(menor > vetor[i]) {
					menor = vetor[i];
				}
			}
		}	
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		//Pares e ímpares
		int countPar = 0;
		int countImpar = 0;
		for (int i = 0; i < vetor.length; i++) {
			
		}
	

	}

}
