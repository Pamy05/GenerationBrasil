package LiveCode;

import java.util.Scanner;

/**4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.**/

public class correçãoWhile {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		int idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0,x=1;
		
		while(x<=6)
		{
		System.out.println("\nEntre com a sua idade: ");
		idade = ler.nextInt();
		System.out.printf("\nEntre com a seu genero: \n1--Mulheres \n2-- Homens \n3--outros");
		sexo = ler.nextInt();
		System.out.printf("\nEntre com a seu fator psicologico: \n1--Calma \n2-- Nervoso \n3--Agressivo");
		fp = ler.nextInt();
		
		if(fp==1)
		{
			contpc++;
		}
		if(sexo == 1 && fp ==2)
		{
			contmn++;
		}
		if(sexo == 2 && fp ==3)
		{
			contha++;
		}
		if(sexo == 3 && fp == 1)
		{
			contoc++;
		}
		if(fp == 2 && idade>40)
		{
			contpn40++;
		}
		if(fp == 1 && idade<18)
		{
			contpc18++;
		}
		x++; /**somar mais um no loop**/
		}
		System.out.println("\n Pessoas calmas: "+contpc+ "\n Mulheres nervosas: " 
		+contmn+"\n Homens agressivos: "+contha+ "\n Outros calmos: "+contoc+
		"\nPessoas nervosas maiores de 40 anos: "+contpn40+"\nPessoas calmas menores de 18 anos: "
		+contpc18);
		
	}

}
