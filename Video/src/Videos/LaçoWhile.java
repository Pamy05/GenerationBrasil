package Videos;

import java.util.Scanner;

public class La�oWhile {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.printf("\nEntre com a sua idade: ");
		idade = ler.nextInt();
		
		while(idade>=1) /**while testa primeiro depois execulta
		                 O la�o ira se repetir at� que a condi��o seja falsa**/
		{
			System.out.printf("\n Sua idade: %d", idade); /** %d � para chamar uma variavel int, no caso por estar usando o printf**/
			
			if(idade>=18)
			{
				System.out.printf("\n Voc� � maior de idade... %d");
			}
			else
			{
				System.out.printf("\n Voc� � menor de idade...");
			}
			System.out.printf("\nEntre com a sua idade: ");
			idade = ler.nextInt();
		}
		
		
		
	}

}
