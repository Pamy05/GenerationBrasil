package Jogo;

//Classe criada para teste.
public class TesteJogo1 {
		public static void main(String args[]) throws InterruptedException {
			Jogador1 j1 =new Jogador1("Sofia","sofi-fernandes@live.com","Chapeuzinho");//Nomeação dos parâmetros. 
			System.out.println(j1.getNome());
			System.out.println("\n");
			j1.imprimirInicoHistoria();//Nesta linha, está sendo chamado o método que contém a introdução da história do jogo.
			j1.verificaOpcaoCaminho();//Já nesta, o método chamado é aquele que contém a verificação da opção escolhida e suas consequentes ações.
					
			Jogador2 j2 =new Jogador2("Pâmela","pam@live.com","Chapeuzinho");//Nomeação dos parâmetros. 
			System.out.println("\n");
			System.out.println(j2.getNome());
			System.out.println("\n");
			j2.imprimirInicoHistoria();//Nesta linha, está sendo chamado o método que contém a introdução da história do jogo.
			j2.verificaOpcaoCaminho();//Já nesta, o método chamado é aquele que contém a verificação da opção escolhida e suas consequentes ações.
		}
}
