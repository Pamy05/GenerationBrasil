package POO;
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class ClasseAviaoTeste {
	public static void main(String args[])
	{
		
		ClasseAviao Aviao1 = new ClasseAviao("AIRBUSA320" , "79000" , "Branco e vermelho");

		System.out.println(Aviao1.getAviaoNaPista());
		
		ClasseAviao Aviao2 = new ClasseAviao("ATR" , "22 800" , "Branco");
		System.out.println(Aviao2.getAviaoNaPista());
				
	}

}
