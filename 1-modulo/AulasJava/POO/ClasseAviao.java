package POO;
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
//atributos um aviao � um veiculo e tem metal,freio de pouso, rodas, motor
//metodos ele voa, pousa 
public class ClasseAviao {

	private String AviaoCor;
	private String AviaoPeso; 
	private String Aviaomodelo;
    
	
	public ClasseAviao (String modelo ,String peso, String cor)
	{
		AviaoCor = cor;
		AviaoPeso = peso;
		Aviaomodelo = modelo;
		
		
	}
	
	
	public String getAviaoNaPista()
	{
		String AviaoNaPista = ("O avi�o a decolar � um modelo "+Aviaomodelo+" com "+AviaoPeso+ " Kl das cores "+AviaoCor);
		return AviaoNaPista; 
	}
	

}
