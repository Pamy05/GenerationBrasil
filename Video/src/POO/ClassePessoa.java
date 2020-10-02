package POO;

public class ClassePessoa {
	 private String primeironome; //atributo private so a class pessoa tem acesso a esses atributos
     private String ultimonome; //atributo
     private String nomedomeio; //atributo
     
     public ClassePessoa (String primeiro, String meio, String ultimo) //construtor sempre com o mesmo nome da class cm boa pratica
     {
    	 primeironome = primeiro;
    	 ultimonome = ultimo;
    	 nomedomeio = meio;
     }
     public String getNomeCompleto()//metodo de retorno do nome completo
     {
    	 String NomeCompleto = primeironome+" "+nomedomeio+" "+ultimonome;
    	 return NomeCompleto; 
     }

}
