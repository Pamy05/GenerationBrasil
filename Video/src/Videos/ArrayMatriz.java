package Videos;

import java.util.Scanner;

public class ArrayMatriz {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int[][] matriz = new int[3][3];
		System.out.println("Matriz de [3][3]\n");
		
		for(int linha=0 ; linha<3 ;linha++)
		{
			for(int coluna=0 ; coluna<3 ; coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				}
		}
		
		System.out.println("\nA matriz ficou...\n");
		for(int linha = 0;linha<3;linha++) {
			for(int coluna = 0;coluna<3;coluna++) {
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
		}
	}
}
