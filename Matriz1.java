package Atividades;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numProcurado;
		int x;
		int cont = 0;
		
		System.out.println("\nDigite o número que procura: ");
		numProcurado = leia.nextInt();
		
		for(x = 0;x < vetor.length; x++) {
			
				if(numProcurado == vetor[x]) {
					cont = x;
				}
			}
				if(cont == 0) {
					System.out.println("\nO número "+numProcurado+" não foi encontrado!");
				}else {
				System.out.println("\nO número "+numProcurado+" está na posição "+cont);
				}
		}
	}