package Videos;



import java.util.*;
public class if_and_else {


        public static void main (String args[])
        {
        	
			@SuppressWarnings("resource")
			Scanner ler = new Scanner (System.in);
        	int idade;
        	String nome;
  
        	System.out.printf("Entre com o seu nome: ");
        	nome = ler.nextLine();
        	
        	ler.nextLine();   // anotar explicação aqui.
        	
        	System.out.printf("Entre com sua idade: ");
        	idade = ler.nextInt();
        	
        	System.out.printf("\nSeu nome: %s" ,nome);  //anotar explicação %s e %d
        	System.out.printf("\nSua idade: %d" ,idade);
        	
        	if(idade>=18)
        	{
        		System.out.printf("\nVocê é mair de idade: ");
        	}
        	else if (idade>=1 && idade<18)
        	{
        		System.out.printf("\nVocê é menor de idade: ");
        	}
        	else 
        	{
        		System.out.printf("\nVocê entrou com uma idade invalida...");
        	}
        	
        }
}
              