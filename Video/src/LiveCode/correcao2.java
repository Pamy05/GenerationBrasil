package LiveCode;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.10/08*/

public class correcao2 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		double num;
		
		System.out.println("entre com um numero: ");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			num = Math.sqrt(num);
			System.out.println("� par: ");
		}
		else
		{
			num = Math.pow(num,2);
			System.out.println("\n� impar: ");
		}
		System.out.printf("valor de num: %5.2f",num);/*%5.2f calibrar as casas
		                                              %5=esquerda | 2f=direita*/
	}

}
