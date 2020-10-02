package Day11_08;

/**1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)**/

public class Ex_1_For {
	
	public static void main (String args[])
	{
         int x = 1000;
         
         for(x=1000;x<=1999;x++)
         {
        	 
        	 if(x%11 == 5)       //*x%i dividi o x pelo i e pega o resto, ai == questiona se é iqual a y: (x%i == y)**/
        	 {
        		 System.out.println();
        	 }
         }
	}
	
}
