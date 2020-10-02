package LiveCode;
import java.util.Scanner;
/*calculadora*/
public class Correcao3 {
	
	public static void main (String args[])
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner (System.in);
		
		int a,b,resultado=0,op;
		
		System.out.println("Entre com o valor de a");
		a= ler.nextInt();
		System.out.println("Entre com o valor de b");
		b= ler.nextInt();
		
		System.out.println("\n1 -- soma\n2 -- diferença \n3 -- multiplicaçao \n4 -- divisao");
		
		System.out.println("\nEntre com sua opção: ");
		op= ler.nextInt();
		
		switch(op)
		{
		case 1:
			resultado = a+b;
			break;
		case 2:
			resultado = a-b;
			break;
		case 3:
			resultado = a*b;
			break;
		case 4:
			resultado = a/b;
			break;
		default:
			System.out.println("Opção invalida: ");
		}
		System.out.println("O resultado foi de: " +resultado);
	}

}
