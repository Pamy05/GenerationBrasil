package LiveCode;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.10/08*/

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
			System.out.println("É par: ");
		}
		else
		{
			num = Math.pow(num,2);
			System.out.println("\nÉ impar: ");
		}
		System.out.printf("valor de num: %5.2f",num);/*%5.2f calibrar as casas
		                                              %5=esquerda | 2f=direita*/
	}

}
