package POO;
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
//classe = cliente/ objeto = lucas e amanda/ atibutos = lucas - cabelo longo e liso e preto/ amanda - cabelo ondulado e longo e ruivo
//metodos = pinta, corta, � atendido
public class ClasseCliente {
	private String CabeloCor;
	private String CabeloTamanho;
	
	
	public ClasseCliente (String cor , String tamanho)
	{
		CabeloCor = cor;
		CabeloTamanho = tamanho;
		
	}
	
	
	public String getCabeloAtual()
	{
		String CabeloAtual ="Cabelo atual " +CabeloCor+" e "+CabeloTamanho;
		return CabeloAtual; 
	}
	public String getAtendido() 
	{
		
		return "Voc� ser� atendido(a)...\n";
	}


	}


