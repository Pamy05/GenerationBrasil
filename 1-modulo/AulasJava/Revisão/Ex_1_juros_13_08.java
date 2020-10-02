package Revisão;

import java.util.Scanner;

/*1- Elabore um programa que calcule o que deve ser pago por um produto, considerando
o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos
da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo
adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
public class Ex_1_juros_13_08 {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		String produto;
		double valor, valorfinal, porcentagem;
		int op;
		
		System.out.println("Entre com produto: ");
		produto = ler.nextLine();
		System.out.println("Entre com o valor da etiqueta: ");
		valor = ler.nextDouble();
		System.out.println("Escolha a opção de pagamento...\n1 -- A vista em dinheiro ou cheque.\n2 -- A vista no cartão de crédito.\n3 -- Em duas vezes.\n4 -- Em três vezes. ");
		op = ler.nextInt();
		
		switch(op)
		{
		case 1: //1 À vista em dinheiro ou cheque, recebe 20% de desconto
		{
		     porcentagem = valor * 20/100;
		     valorfinal = valor - porcentagem;
		     System.out.println(produto+ " com desconto de 20% fica por: "+valorfinal);
			
		}
		break;
		case 2: //2 À vista no cartão de crédito, recebe 15% de desconto
		{
			porcentagem = valor * 15/100;
	        valorfinal = valor - porcentagem;
	        System.out.println(produto+ " com desconto de 15% fica por: "+valorfinal);
		}
		break;
		case 3: //3 Em duas vezes, preço normal de etiqueta sem juros
		{
			valorfinal = valor/2;
			System.out.println(produto+ " em duas parcelas sem juros fica por: "+valorfinal);
		}
		break;
		case 4: //4 Em três vezes, preço normal de etiqueta mais juros de 10%*/
		{
			valor = valor + (10*valor/100);
			valorfinal = valor/3;
			System.out.println(produto+ " em três parcelas com 15% de juros fica por: "+valorfinal);
		}
		break;
		default:
		{
			System.out.println("Forma de pagamento invalida!!!");
			
		}
		
	}
}
}
