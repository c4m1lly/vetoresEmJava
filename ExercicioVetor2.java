package vetor;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		int vetorNumero []= new int[10];
		String numerosPares = "";
		String impares = "" ;
		int soma=0;
		float media= 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int indice = 0; indice <10; indice ++ ) {
			System.out.println("Digite um número");
			vetorNumero[indice] = leia.nextInt();

		}
		for(int indice = 0; indice <10; indice++) {
			soma = soma + vetorNumero[indice];
			if(vetorNumero[indice] % 2 == 0) {
				numerosPares = numerosPares + vetorNumero[indice];
			}
			
		}
		media = soma / 10;
		for(int indice = 1; indice <10; indice++) {
			if(vetorNumero[indice] % 2 == 1) {
			impares = impares + vetorNumero[indice];
			}}
		System.out.println("Os elementos nos índices impares: " + impares);
		System.out.println("Os elementos pares: " + numerosPares);
		System.out.println("A soma dos números pares : " + soma);
		System.out.println("A média é: " + media);

		


	}
	
}
