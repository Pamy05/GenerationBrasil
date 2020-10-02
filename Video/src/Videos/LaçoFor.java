package Videos;

public class LaçoFor {

	 public static void main (String args[])
	 {
		 int x,soma=0; /**x é o loop, pode ser qualquer letra.**/
		 
		 for (x=1;x<=10;x++) /**O laço ira se repetir até que a condição final seja falsa**/
		 {
			 System.out.printf("\n %d",x); /** %d é para chamar uma variavel int, no caso por estar usando o printf**/
			 soma = soma + x;
		 }
		 System.out.printf("\n Soma total: %d ",soma);
	 }
}
