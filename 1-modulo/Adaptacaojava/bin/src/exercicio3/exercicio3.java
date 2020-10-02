package exercicio3;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args)
	{
		int tempo,horas,horas_s,minutos,segundos;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Entre com os segundos decorridos: ");
		tempo = ler.nextInt();
		
		horas_s = 3600;
		
        horas = tempo/horas_s;
		minutos = (tempo -horas_s*horas)/60;
		segundos = (tempo - horas_s*horas - minutos*60);
		
		 System.out.println("Tempo decorrido de " +horas+ " hora(s) e " +minutos+ " minutos e " +segundos+ " segundos e subindo ");
		
		
		
	}

}
