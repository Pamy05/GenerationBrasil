package LiveCode;

import java.util.Scanner;
/*2-	Faça um programa que entre com três números e coloque em ordem crescente.

Menor		Meio		Maior
A			B			C
A			C			B
B			A			C
B			C			A
C			A			B
C			B			A
 lista 10/08*/

public class Correcao1 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("\nentre com o valor de a: ");
		a = ler.nextInt();
		System.out.println("\nentre com o valor de b: ");
		b = ler.nextInt();
		System.out.println("\nentre com o valor de c: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("ordem crescente: "+a+ ", "+b+", "+c);
		}
		else if (a<=c && c<=b)
		{
			System.out.println("ordem crescente: "+a+ ", "+c+", "+b);
					
		}
		else if(b<=a && a<=c)
		{
			System.out.println("ordem crescente: "+b+ ", "+a+", "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("ordem crescente: "+b+ ", "+c+", "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("ordem crescente: "+c+ ", "+a+", "+b);
		}
		else
		{
			System.out.println("ordem crescente: "+c+ ", "+b+", "+a);
		}
	}

}
