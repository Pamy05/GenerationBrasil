package Videos;

public class La�oFor {

	 public static void main (String args[])
	 {
		 int x,soma=0; /**x � o loop, pode ser qualquer letra.**/
		 
		 for (x=1;x<=10;x++) /**O la�o ira se repetir at� que a condi��o final seja falsa**/
		 {
			 System.out.printf("\n %d",x); /** %d � para chamar uma variavel int, no caso por estar usando o printf**/
			 soma = soma + x;
		 }
		 System.out.printf("\n Soma total: %d ",soma);
	 }
}
