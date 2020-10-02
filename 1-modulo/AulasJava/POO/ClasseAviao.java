package POO;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
//atributos um aviao é um veiculo e tem metal,freio de pouso, rodas, motor
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
		String AviaoNaPista = ("O avião a decolar é um modelo "+Aviaomodelo+" com "+AviaoPeso+ " Kl das cores "+AviaoCor);
		return AviaoNaPista; 
	}
	

}
