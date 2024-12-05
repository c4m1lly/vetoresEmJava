package vetor;

import java.util.Scanner;

public class exercicioUmVetor {

	public static void main(String[] args) {
		int vetorNum[] = { 2,5,1,3,4,9,7,8,10,6 };
		int indice = 0;
		int entradaDados = 0;
		int contador =0;
		

		Scanner leia = new Scanner(System.in);
		entradaDados = leia.nextInt();
		
		for (indice = 0; indice < 10; indice++) {
			
			if (entradaDados == vetorNum[indice]) {
			
				System.out.println(" O número "+ vetorNum[indice]+ " está na posição º: " + indice);
				contador ++; 
			}
		
		}
		if (contador==0) {
			System.out.println("O número "+ entradaDados +" não foi encontrado!");
		}
	}

}
