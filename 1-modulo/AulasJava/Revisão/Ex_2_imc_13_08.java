package Revisão;

import java.util.Scanner;

/**2- O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para
dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC =
peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição
de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/

/* PEGO NA INTERNET FAIXAS MAIS ESPECIFICAS
Baixo peso muito grave = abaixo de 16 kg/m².
Baixo peso grave = entre 16 e 16,99 kg/m².
Baixo peso = entre 17 e 18,49 kg/m².
Peso normal = entre 18,50 e 24,99 kg/m².
Sobrepeso = entre 25 e 29,99 kg/m².
Obesidade grau I = entre 30 e 34,99 kg/m².
Obesidade grau II = entre 35 e 39,99 kg/m².
Obesidade grau III (obesidade mórbida) = maior que 40 kg/m².*/
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
		if(imc<=16)//Baixo peso muito grave = abaixo de 16 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de baixo peso muito grave, procure ajuda especializada. ");
			
		}
		if(imc>=16 && imc<=16.99)//Baixo peso grave = entre 16 e 16,99 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de baixo peso grave, procure ajuda especializada. ");
		}
		if(imc>=17 && imc<=18.49)//Baixo peso = entre 17 e 18,49 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de baixo peso,procure ajuda especializada.");
		}
		if(imc>=18.50 && imc<=24.99)//Peso normal = entre 18,50 e 24,99 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de peso ideal, parabéns continue assim. ");
		}
		if(imc>=25 && imc<=29.99)//Sobrepeso = entre 25 e 29,99 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de sobrepeso, procure ajuda especializada.  ");
		}
		if(imc>=30 && imc<=34.99)//Obesidade grau I = entre 30 e 34,99 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de obesidade I, procure ajuda especializada. ");
		}
		if(imc>=35 && imc<=39.99)//Obesidade grau II = entre 35 e 39,99 kg/m².
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de obesidade II, procure ajuda especializada. ");
		}
		if(imc>=40)//Obesidade grau III (obesidade mórbida) = maior que 40 kg/m²
		{
			System.out.println("imc - "+imc+"\n"+nome+" você esta na faixa de obesidade III, procure ajuda especializada. ");
		}
		System.out.println("\n\t TABELA PARA COMPARAÇÃO: ");
		System.out.println("\n- | imc 16 - Baixo peso muito grave ");
		System.out.println("\n- | imc 16 até 16,99 - Baixo peso grave   ");
		System.out.println("\n- | imc 17 até 18,49 - Baixo peso   ");
		System.out.println("\n- | imc 18,50 até 24,99 - Peso normal  ");
		System.out.println("\n- | imc 25 até 29,99 - Sobrepeso | imc 25 até 29,99 ");
		System.out.println("\n- | imc 30 até 34,99 - Obesidade grau I  ");
		System.out.println("\n- | imc 35 até 39,99 Obesidade grau II  ");
		System.out.println("\n- | imc 40+ - Obesidade grau III (obesidade mórbida) ");
		
	}

}
