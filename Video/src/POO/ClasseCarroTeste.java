package POO;

public class ClasseCarroTeste {
     public static void main (String args[])
     {
    	 ClasseCarro meuCarro = new ClasseCarro();
    	 meuCarro.cor = "Vermelho";
    	 meuCarro.modelo = "Passat";
    	 meuCarro.velocidadeAtual = 0;
    	 meuCarro.velocidadeMaxima = 80;
    	 
    	 meuCarro.liga();
    	 meuCarro.acelera(90);
    	 System.out.println("Velocidade atual..." +meuCarro.velocidadeAtual);
    	 
    	 System.out.println("Marcha atual..."+meuCarro.pegaMarcha());     }
}
