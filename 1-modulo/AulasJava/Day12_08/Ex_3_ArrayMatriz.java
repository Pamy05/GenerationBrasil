package Day12_08;

import java.util.Scanner;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class Ex_3_ArrayMatriz {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int[][] matriz = new int[3][3];
		int cont10=0;
		
		for(int linha=0 ; linha<3 ;linha++)
		{
			for(int coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				
				if(matriz[linha][coluna] >10) 
				{
					cont10++;
				}
				}
		}
		System.out.println(cont10);
	}
}
