package Atividades;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vet[] = new int[10];
		int somaVetor = 0,x;
		float mediaVet;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um número: ");
			vet[x] = leia.nextInt();
			
			if(x % 2 == 1) {
				System.out.println("\nElemento de índice impar: "+vet[x]);
			}
			
			if(vet[x] % 2 == 0) {
				System.out.println("\nO número: "+vet[x]+" é um elemento par...");
			}
			
			somaVetor += vet[x];
		}
		mediaVet = somaVetor / x;
		System.out.println("\nSoma dos elementos do vetor: "+somaVetor);
		System.out.println("\nA média dos elementos do vetor é: "+mediaVet);

	}

}