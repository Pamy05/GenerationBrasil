package Day11_08;

import java.util.Scanner;

/**3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)**/
/** contme21 contma50 x
 */

public class Ex_3_While {
	
	
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int contme21 = 0, contma50 = 0, idade = 0, x=1;
		
		while(x>=1)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = ler.nextInt();
			
			if(idade >=99)
			{
				System.out.println("Pessoas com menos de 21 anos: "+contme21);
				System.out.println("Pessoas com mais de 50 anos: "+contma50);
				break;
				}
			
			if(idade <=21)
			{
				contme21++;
			}
			if(idade >=50)
			{
				contma50++;
			}
			x++;
		}
		
			
	}

}
