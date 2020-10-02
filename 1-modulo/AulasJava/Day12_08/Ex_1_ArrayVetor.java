package Day12_08;



/**1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.**/
public class Ex_1_ArrayVetor {
	@SuppressWarnings("unused")
	public static void main (String args[])
	{
		
		
		int[] A = {1, 0, 5, 100, -5, 7}; //condição 'a' e 'c'
		int soma;
		
		soma = A[0] + A[1] + A[5]; //condição b
		
		for (int i=0;i<5;i++)
		{
			System.out.println("\n"+A[i]);
		}

		
				
	}
}
