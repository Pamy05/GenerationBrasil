package POO;

public class TelefoneCelular extends Telefone{
	public TelefoneCelular()
	{
		super("Celular");
	}
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
			case 1:
				System.out.println("Trim...Trim...Trim... ");
				break;
			case 2:
				System.out.println("toc...toc...toc... ");
				break;
			default:
				System.out.println("Salve o tricolor Paulista...");
				break;
		}
	}
	public void disca(String numero)
	{
		System.out.println("Discando: "+numero+" é um celular...");
	}
   
}
