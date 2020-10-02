package POO;

public class TelefonePublico extends Telefone{
	public TelefonePublico()
	{
		super("Público");
	}
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("ring...ring...ring...");
		}
	}
    public void disca(String numero)
    {
    	if(numero.charAt(0) == '9')//charAt ele pega da string a pocisão colocada como parametro
    	{
    		System.out.println("Este telefone não faz chamadas para celulares ");
    	}
    	else
    	{
    		System.out.println("Discando: "+numero);
    	}
    }
}
