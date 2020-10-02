package Videos;

import java.util.Scanner;

public class LaçoDoWhile {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = ler.nextInt();
		
		do /**Do execulta pelo menos uma vez e depois testa**/
		{
			System.out.printf("\n Sua idade: %d", idade); /** %d é para chamar uma variavel int, no caso por estar usando o printf**/
			
			if(idade>=18)
			{
				System.out.printf("\n Você é maior de idade... %d");
			}
			else
			{
				System.out.printf("\n Você é menor de idade...");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = ler.nextInt();
		}while(idade>=1); /**while testa primeiro depois execulta
        O laço ira se repetir até que a condição seja falsa**/
		
		
		
	}

}
