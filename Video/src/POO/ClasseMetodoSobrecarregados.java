package POO;

public class ClasseMetodoSobrecarregados {
	public void testaMetodosSobrecarregados()
	{
		System.out.printf("Salario em n�mero inteiro: %d\n",salario(1000));
		System.out.printf("Salario em n�mero double: %f\n",salario(7.500));
		
	}
	public int salario(int valorint)
	{
		System.out.printf("Salario com argumento inteiro: %d\n",valorint);
		return valorint * valorint;
	}
	public double salario(double valordouble)
	{
		System.out.printf("Salario com argumento double: %f\n",valordouble);
		return valordouble * valordouble;
	}

}
