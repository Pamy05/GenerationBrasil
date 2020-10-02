package Videos;

import java.util.Scanner;

public class ArrayVetor {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int[] arrayUm = {12, 3, 5, 68, 9, 6, 73, 44, 465, 65, 321};
		int[] arrayDois = {43, 42, 4, 8, 55, 21, 2, 45};
		
		float[] nota =new float[5];
		
		//tamanho do array
		if (arrayDois.length >8)
		{
			System.out.println("Tamanho do array Dois � maior que 8:");
		}
		else
		{
			System.out.println("Tamanho do array Dois � menor que 8:");
		}
		System.out.println("Tamanho do array um: "+arrayUm.length); //length conta o tamanho do array
		
		//utiliza��o do for each - ele varre todo o vetor e n�o precisa de contador(variavel e loop
		String[] cars = {"volvo","", "ford", "mazda"};
		
		for  (String i : cars)
		{
			System.out.println(i);
		}
		//populando um array atraves de um la�o de repetis�o
		for (int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota: ");
			nota[i] = ler.nextFloat();
		}
		//Apresentando um array
		for (int i=0;i<5;i++)
		{
			System.out.println("Nota "+i+" = "+nota[i]);
		}
		
		
	}
}
