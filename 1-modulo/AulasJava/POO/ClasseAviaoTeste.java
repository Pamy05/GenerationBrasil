package POO;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class ClasseAviaoTeste {
	public static void main(String args[])
	{
		
		ClasseAviao Aviao1 = new ClasseAviao("AIRBUSA320" , "79000" , "Branco e vermelho");

		System.out.println(Aviao1.getAviaoNaPista());
		
		ClasseAviao Aviao2 = new ClasseAviao("ATR" , "22 800" , "Branco");
		System.out.println(Aviao2.getAviaoNaPista());
				
	}

}
