package exercicio2;

import java.util.Scanner;

public class exercicio2 {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		String nome;
		int td,anos,meses,dias;
		
        
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Entre com o seu nome meu joven: ");
		nome = ler.nextLine();
		System.out.println("Entre seus dias de vida: ");
		td = ler.nextInt();
		
		anos = td/365;
	    meses = (td%365) / 30;	
	    dias = (td%365)%30;
	    
	    System.out.println("Ora ora..." + nome + " me parece que você tem " + anos + " anos e " + meses + " meses e " + dias + " dias de vida, parabéns continue assim!!! (/>v<)/*");
	}

}
