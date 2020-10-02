package Day11_08;

import java.util.Scanner;

/**5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)**/

public class Ex_5_Do_While {
	
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int n, soma = 0;
		
		
		do
		{
			System.out.println("Entre com um valor:");
			n = ler.nextInt();
			
			soma = n + soma;
			if(n<=0)
			{
				System.out.println("\nSoma dos valores até o momento foi de: "+soma);
				break;
			}
			
		}while(n>=0);
		
		
	}
}
