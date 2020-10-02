package POO;

public class TelefonePublico extends Telefone{
	public TelefonePublico()
	{
		super("P�blico");
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
    	if(numero.charAt(0) == '9')//charAt ele pega da string a pocis�o colocada como parametro
    	{
    		System.out.println("Este telefone n�o faz chamadas para celulares ");
    	}
    	else
    	{
    		System.out.println("Discando: "+numero);
    	}
    }
}
