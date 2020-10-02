package POO;

public abstract class Telefone {
	private String tipo;
	
	//metodo abstrato para uso em polimorfiso
	abstract public void disca(String numero);
	//metodo abstrato para uso em polimorfiso
	abstract public void toca(int numToques);
	
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
