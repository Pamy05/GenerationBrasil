package Day11_08;

import java.util.Scanner;

/**6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)**/

public class Ex_6_Do_While {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int n,acm = 0,soma=0;
		double media = 0.0;
		
		do
		{
			
			System.out.println("Entre com um valor ou digite 0 para encerrar: ");
			n = ler.nextInt();
			
			if(n==0)
			{
				System.out.println("\nSimulação encerrada: ");
				System.out.println("\nMedia dos multiplos de 3 inseridos foi de: "+media);
				break;
			}
			
			if(n%3 == 0) //*x%i dividi o x pelo i e pega o resto, ai == questiona se é iqual a y: (x%i == y)**/
			{
				acm++;
				soma = soma + n;
				media = soma/acm;
			}
		}while(n>=1);
	}

}
