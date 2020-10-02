package Day12_08;

import java.util.Scanner;

/**2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
public class Ex_2_ArrayVetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
	    
		int vetor[] = new int[6], somapar=0,quantimpar=0;
		int vetpar[] = new int[6];
		int vetimp[] = new int[6];	
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Entre com um valor: ");
			vetor[x] = ler.nextInt();
			if(vetor[x]%2 == 0)
			{
				vetpar[x] = vetpar[x] + vetor[x];
				//System.out.println("\nPar: "+vetpar[x]); //*mostrar o numero par logo abaixo do inserido. se for o caso.
				somapar = somapar+vetor[x];
				
			}
			else
			{
				vetimp[x] = vetimp[x] + vetor[x];
				//System.out.println("\nImpar: "); //*mostrar o numero impar logo abaixo do inserido, se for o caso.
				quantimpar++;
				
			}
		}
		/*Mostra os pares e impares com for em loop**/
		
		System.out.println("Números impares inseridos em sistema: ");
		for(int x=0;x<6;x++)
		{
			System.out.println("|"+vetimp[x]+"|");
		}
		System.out.println("Números pares inseridos em sistema: ");
		for(int x=0;x<6;x++)
		{
			System.out.println("|"+vetpar[x]+"|");
		}
		
		
		System.out.println("\nSoma de números pares digitados: "+somapar);
		System.out.println("\nQuantidade de entradas de números ímpares: "+quantimpar);
		
	}
}
