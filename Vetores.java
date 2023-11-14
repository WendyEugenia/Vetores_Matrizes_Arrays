package Atividades;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int numero, x;
			boolean procura = false;
			Scanner leia = new Scanner (System.in);
			
			int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
			
			System.out.println("Digite o número que você deseja encontrar");
			numero = leia.nextInt();
			
			for (x=0;x<vetor.length;x++) {
				
				if(numero == vetor[x]) {
					procura = true;
					System.out.println("\n O número "+numero+" está na posição "+x);	
				}
			}
				
			if(! procura) {
				System.out.println("\n O número "+numero+" não foi encontrado!");
			}
		}

	} 