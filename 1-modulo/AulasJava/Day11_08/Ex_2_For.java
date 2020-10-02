package Day11_08;

 /**2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)**/

                        /**FEITO EM LIVECODE**/
import java.util.Scanner;

public class Ex_2_For {

	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int numero,contpar=0,contimpar=0;
		for(int x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um numero: ");
			numero = ler.nextInt();
			
			if(numero%2==0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
		}
		System.out.println("\nNumeros pares: "+contpar);
		System.out.println("\nNumeros impares: "+contimpar);
	}
}
