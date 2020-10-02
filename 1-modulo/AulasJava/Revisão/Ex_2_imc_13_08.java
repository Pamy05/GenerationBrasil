package Revis�o;

import java.util.Scanner;

/**2- O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de Sa�de para
dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC =
peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condi��o
de acordo com a tabela abaixo.
IMC em adultos Condi��o
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/

/* PEGO NA INTERNET FAIXAS MAIS ESPECIFICAS
Baixo peso muito grave = abaixo de 16 kg/m�.
Baixo peso grave = entre 16 e 16,99 kg/m�.
Baixo peso = entre 17 e 18,49 kg/m�.
Peso normal = entre 18,50 e 24,99 kg/m�.
Sobrepeso = entre 25 e 29,99 kg/m�.
Obesidade grau I = entre 30 e 34,99 kg/m�.
Obesidade grau II = entre 35 e 39,99 kg/m�.
Obesidade grau III (obesidade m�rbida) = maior que 40 kg/m�.*/
public class Ex_2_imc_13_08 {
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		float peso, altura, imc;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite seu peso: ");
		peso = ler.nextFloat();
		System.out.println("Digite sua altura: ");
		altura = ler.nextFloat();
		
		imc = peso / (altura*altura);
		System.out.println();
		if(imc<=16)//Baixo peso muito grave = abaixo de 16 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de baixo peso muito grave, procure ajuda especializada. ");
			
		}
		if(imc>=16 && imc<=16.99)//Baixo peso grave = entre 16 e 16,99 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de baixo peso grave, procure ajuda especializada. ");
		}
		if(imc>=17 && imc<=18.49)//Baixo peso = entre 17 e 18,49 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de baixo peso,procure ajuda especializada.");
		}
		if(imc>=18.50 && imc<=24.99)//Peso normal = entre 18,50 e 24,99 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de peso ideal, parab�ns continue assim. ");
		}
		if(imc>=25 && imc<=29.99)//Sobrepeso = entre 25 e 29,99 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de sobrepeso, procure ajuda especializada.  ");
		}
		if(imc>=30 && imc<=34.99)//Obesidade grau I = entre 30 e 34,99 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de obesidade I, procure ajuda especializada. ");
		}
		if(imc>=35 && imc<=39.99)//Obesidade grau II = entre 35 e 39,99 kg/m�.
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de obesidade II, procure ajuda especializada. ");
		}
		if(imc>=40)//Obesidade grau III (obesidade m�rbida) = maior que 40 kg/m�
		{
			System.out.println("imc - "+imc+"\n"+nome+" voc� esta na faixa de obesidade III, procure ajuda especializada. ");
		}
		System.out.println("\n\t TABELA PARA COMPARA��O: ");
		System.out.println("\n- | imc 16 - Baixo peso muito grave ");
		System.out.println("\n- | imc 16 at� 16,99 - Baixo peso grave   ");
		System.out.println("\n- | imc 17 at� 18,49 - Baixo peso   ");
		System.out.println("\n- | imc 18,50 at� 24,99 - Peso normal  ");
		System.out.println("\n- | imc 25 at� 29,99 - Sobrepeso | imc 25 at� 29,99 ");
		System.out.println("\n- | imc 30 at� 34,99 - Obesidade grau I  ");
		System.out.println("\n- | imc 35 at� 39,99 Obesidade grau II  ");
		System.out.println("\n- | imc 40+ - Obesidade grau III (obesidade m�rbida) ");
		
	}

}
