package exercicio1;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args)
	{
		int anos,meses,dias,tdias;
		String nome;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Entre com o seu nome meu joven: ");
		nome = ler.nextLine();
		System.out.println("Entre seus anos de vida: ");
		anos = ler.nextInt();
		System.out.println("Entre seus meses de vida: ");
		meses = ler.nextInt();
		System.out.println("Entre seus dias de vida: ");
		dias = ler.nextInt();
		
		tdias = anos*365+meses*30+dias;
		
		System.out.println(nome+ " o seu total dias de vida até o momento foi de: "+tdias);
		
		
	}

}
