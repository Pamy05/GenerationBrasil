package POO;
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
//classe = cliente/ objeto = lucas e amanda/ atibutos = lucas - cabelo longo e liso e preto/ amanda - cabelo ondulado e longo e ruivo
//metodos = pinta, corta, � atendido
public class ClasseClienteTeste {
          public static void main (String args[])
          {
        	  ClasseCliente Lucas = new ClasseCliente("preto" , "longo");
        	  
        	  
        	  
        	  System.out.println(Lucas.getAtendido());
        	  System.out.println(Lucas.getCabeloAtual());
        	  
         }
}
