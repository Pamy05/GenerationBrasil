package Jogo;

//Para utilizar nossos objetos instanciados "ler" e "entrada".
import java.util.Scanner;

//Criação da classe herdeira da super classe Pessoa e inclusão de novos atributos para Jogador, além dos que ele irá herdar da super classe Pessoa.
public class Jogador1 extends Pessoa{
		public String personagem;//Atributo extra, da classe Jogador.
		Scanner ler = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		float[] vetor = new float[10];//Declaração do vetor usado no primeiro desafio.
		float[] vetor2 = new float[5];//Declaração do vetor usado no segundo desafio.
		int[][] matriz = new int[3][3];//Declaração da matriz para desafio segundo caminho
		int cont=0;//Contador utilizado para o primeiro desafio.
		int soma_diagonal=0;

		//Criação do método construtor da classe Jogador.
		public Jogador1(String nome, String email, String personagem) {
			super(nome, email);//A palavra "super" refere-se à super classe Pessoa e as infomrações herdadas por ela.
			this.personagem = personagem;
		}

		//Criação dos getter e setter para puxar as informações da classe Jogador.
		public String getPersonagem() {
			return personagem;
		}

		public void setPersonagem(String personagem) {
			this.personagem = personagem;
		}
		
		public String getNome() {
			return "Jogador 1: "+super.getNome();
		}
		
				
		//Método para imprimir a introdução da história deste jogo.
		public void imprimirInicoHistoria(){
			System.out.println("Mãe de Chapeuzinho: \n--Chapeuzinha minha filha, mamãe está muito ocupada e preciso que você leve essa cesta com alguns remédios e doces para sua avó, \nela está doente e essa cesta e sua visita vão animar ela. E vá pela estrada, nada de ir pelo bosque!");
				//Código para ter uma pausa entre as frases.
				try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
				System.out.println("\n--Então chapeuzinho decide seguir em direção a casa de sua avó.....");	
				//Código para ter uma pausa entre as frases.
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
		}
		
		
		
		//Método para puxar a opção de caminho escolhida pelo jogador.
		public void verificaOpcaoCaminho() throws InterruptedException{			 
			//Pergunta ao usuário sobre qual caminho ele irá escolher.
			System.out.println("\n"+"**"+personagem+", começou a chover, e você não tem nada para se proteger, qual caminho você irá seguir?\n \n1- Estrada, segura porém com muita chuva. \n2- Bosque, sem muita chuva mas perigoso.");
			//Lendo a opção	escolhida. No caso, por tratar-se de uma variável intera, irá conter nela apenas o número referente ao caminho escolhido (1 ou 2).
			int op = ler.nextInt();	
			//Código para ter uma pausa entre as frases.
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
				//Laço condicional para direcionar a história de acordo com o caminho escolhido(1-estrada/2-Bosque).
				switch (op){
					case 1: //Caso o usuário escolha o caminho 1(Estrada).
						System.out.println("\n--Após alguns minutos de caminhada, você avista uma frecha de luz de um lindo pôr de sol, após um pequeno período de chuva. \nE isso lhe enche de forças para seguir o longo caminho pela frente...");
						//Código para ter uma pausa entre as frases.
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						//Início do primeiro desafio ao usuário
						System.out.println("\n--Mas nem tudo são rosas, para continuar nesse caminho, vamos testar sua meória!!\t(Preste atenção aos números que escreve e suas posições)");	
						//Preenchimento do vetor, para localização do número pedido na devida posição requerida.
						for(int i=0; i<10; i++) { 
						System.out.println("**Digite um número de 1 a 10 para "+(i+1)+": ");
							vetor[i] = entrada.nextFloat();
						}
						//Laço de repetição usado apenas para pular linhas e tornar distante os valores preenchidos para o usuário não ver e cumprir honestamente com o desafio.
						for(int i=0; i<15; i++) { 
							System.out.println("\n");
						}
						//Desafio lançado ao usuário, validando o número pedido com a posição pedida no vetor.
						System.out.println("\n"+"**"+personagem+", você se lembra qual número escreveu na terceira casa? Digite o número: " );
						float num_digitado = ler.nextFloat();						
						//Caso o usuário digite um número diferente do que foi pedido para a posição pedida, repetir até que acerte com o laço de repetição while.
						while (num_digitado!=vetor[2]) {//Lembrete: o vetor conta as posições a partir de zero, então para achar e comparar o número digitado na posição 3, começando de 1, com o que está no vetor, o vetor deve ser vetor[2].
							System.out.println("**Você errou! Digite novamente: ");
							num_digitado = ler.nextFloat();
							cont++;
						}
						//Esta variável foi utilizada para guardar a quantidade de vezes que o usuário errou e digitou novamente, sendo contado se o usuário errar ao menos uma vez até quantas vezes de fato errou.
						int num_vzs= cont;
						//Mensagem para continuação da história.
						System.out.println("\n"+"--"+personagem+", você acertou...poderá prosseguir :D\n");
						//Código para ter uma pausa entre as frases.
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
						
							e.printStackTrace();
						}
						//Mensagem com nova mensagem de decisão para o usuário.
						System.out.println("\n**Continuando sua caminhada, você encontra D.Maria, o que gostaria de fazer? \n1-Dizer olá. \n2-Passar reto");
						//Leitura da decisão do usuário (1-Dizer olá/2-Passar reto). Neste caso, a variável, por ser inteira, irá conter nela apenas o número referente à decisão tomada (1 ou 2).
						int op_maria = ler.nextInt();						 
						if (op_maria==1){//Laço condicional para caso a opção escolhida seja a 1.(Dizer olá a D.Maria).
							//Nesta condição, estamos comparando a contabilização feita anteriormente de quantas vezes o usuário errou, ou se errou pelo menos uma vez.
							if (num_vzs==0) {//Este primeiro refere-se ao caso de o usuário não errar nenhuma vez no primeiro desafio, e ter escolhido a opção 1 ao encontrar a D.Maria(1-Dizer olá).
								System.out.println("\n--Após conversar com D.Maria,você continua sua caminhada e se depara com uma barraca de sorvete...");
								//Código para ter uma pausa entre as frases.
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								//Utilizamos este contador para que, caso o usuário tenha passado direto no primeiro desafio, neste ponto ele não precisará fazer o segundo desafio.
								System.out.println("\n**Como conseguiu o desafio de memória sem errar nenhuma vez, você conquistou um sorvete, escolha o sorvete: \n1-Morango \n2-Nutella");
								//Variável criada para ler a opção de sabor de sorvete que o usuário irá escolher. No caso, por tratar-se de uma variável inteira, irá reter nela apenas os números referentes aos sabores(1 ou 2).
								int op_svt = ler.nextInt();
									//Laço condicional criado para verificação do sabor escolhido e diferenciação de mensagens a partir disto.
									if (op_svt==1) {
										System.out.println("\n--Aproveite seu sorvete de Morango :D");
									}else {
										System.out.println("\n--Aproveite seu sorvete de Nutella :D");
									}
									//Código para ter uma pausa entre as frases.
									try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
								    System.out.println("\n--Após aproveitar seu sorvete, você continuou sua caminhada e conseguiu chegar na sua avó. Parabéns GUERREIRAAA!!!");
							
							}else {//Este else refere-se ao caso de o usuário ter errado o primeiro desafio ao menos uma vez, e escolhido a opção 1 ao encontrar a D.Maria(1-Dizer olá).
								//Mensagens referente ao segundo desafio.								
								System.out.println("\n--Após conversar com D.Maria,você continua sua caminhada e se depara com uma barraca de sorvete...");
								//Código para ter uma pausa entre as frases.
								try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								System.out.println("\n--Porém, como não conseguiu alcançar seu primeiro desafio de primeira, você não receberá seu sorvete, a menos que consiga passar pelo próximo desafio!");
								//Preenchimento do vetor, para localização do números que serão necessários para este segundo desafio.
								for(int i=0; i<10; i++) { 
									System.out.println("**Digite um número de 1 a 10 para "+(i+1)+": ");
										vetor[i] = entrada.nextFloat();
								}
								//Operação a ser efetuada pelo usuário entre os números requeridos, para comparação das respostas.
								float mult = vetor[1]*vetor[4];
								//Laço de repetição usado apenas para pular linhas e tornar distante os valores preenchidos para o usuário não ver e cumprir honestamente com o desafio.
								for(int i=0; i<15; i++) { 
									System.out.println("\n");
								}
								//Desafio lançado ao usuário.
								System.out.println("\n**Se lembra dos números que escreveu em segundo lugar e quinto lugar? Ok...digite o resultado da multiplicação entre ambos: ");
								//Leitura da resposta do usuário.
								num_digitado = ler.nextFloat();
								//Laço condicional para validar se o resultado dado pelo usuário está correto, para continuação da história de acordo com essa comparação. 
								//Desta vez, não foi utilizado o laço de repetição while para que o usuário tivesse mais uma chance, pois neste desafio, ele terá apenas uma chance ou ja terão outra consequências.
								if(num_digitado==mult) {//Este será o resultado para caso o resultado do usuário, após a comparação, esteja correto.
									System.out.println("**Parabéns "+personagem+", você conseguiu passar por mais esse desafio, e ganhará um sorvete, escolha qual sabor você quer: \n1-Morango\n2-Nutella");
									//Variável criada para ler a opção de sabor de sorvete que o usuário irá escolher. No caso, por tratar-se de uma variável inteira, irá reter nela apenas os números referentes aos sabores(1 ou 2).
									int op_svt = ler.nextInt();									
									if (op_svt==1) {//Laço condicional criado para verificação do sabor escolhido e diferenciação de mensagens a partir disto.
										System.out.println("\n--Aproveite seu sorvete de Morango :D");
									}else {
										System.out.println("\n--Aproveite seu sorvete de Nutella :D");
									}
									//Código para ter uma pausa entre as frases.
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
									System.out.println("\n--Após aproveitar seu sorvete, você continuou sua caminhada e conseguiu chegar na sua avó. Parabéns GUERREIRAAA!!!");
								
								}else {//Este será o resultado para caso o resultado do usuário, após a comparação, esteja incorreto.
										System.out.println("--Sinto muito, mas você não conseguiu passar por mais esse desafio, e não ganhará um sorvete :/");
										//Código para ter uma pausa entre as frases.
										try {
											Thread.sleep(4000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
										System.out.println("\n--Após continuar sua jornada até a casa de sua avó, mesmo sem sorvete, você conseguiu chegar em segurança.Parabés!!!");
								}
								
						 }						
						}else {	//Laço condicional para caso a opção escolhida seja a 2.(Passar reto pela D.Maria).						
							//Nesta condição, estamos comparando a contabilização feita anteriormente de quantas vezes o usuário errou, ou se errou pelo menos uma vez.
							if (num_vzs==0) {//Este primeiro refere-se ao caso de o usuário não errar nenhuma vez no primeiro desafio, e ter escolhido a opção 2 ao encontrar a D.Maria(2-Passar reto).
								System.out.println("\n--Você continua sua caminhada e se depara com uma barraca de sorvete...");
								//Código para ter uma pausa entre as frases.
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}								
								//Utilizamos este contador para que, caso o usuário tenha passado direto no primeiro desafio, neste ponto ele não precisará fazer o segundo desafio.
								System.out.println("\n**Como conseguiu o desafio de memória sem errar nenhuma vez, você conquistou um sorvete, escolha o sorvete: \n1-Morango \n2-Nutella");
								//Variável criada para ler a opção de sabor de sorvete que o usuário irá escolher. No caso, por tratar-se de uma variável inteira, irá reter nela apenas os números referentes aos sabores(1 ou 2).
								int op_svt = ler.nextInt();
								//Laço condicional criado para verificação do sabor escolhido e diferenciação de mensagens a partir disto.
									if (op_svt==1) {
										System.out.println("\n--Aproveite seu sorvete de Morango :D");
									}else {
										System.out.println("\n--Aproveite seu sorvete de Nutella :D");
									}
									//Código para ter uma pausa entre as frases.
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
								    System.out.println("\n--Após aproveitar seu sorvete, você continuou sua caminhada e conseguiu chegar na sua avó. Parabéns GUERREIRAAA!!!");
							}else {//Este else refere-se ao caso de o usuário ter errado o primeiro desafio ao menos uma vez, e escolhido a opção 2 ao encontrar a D.Maria(2-Passar reto).
								//Mensagens referente ao segundo desafio.
								System.out.println("\n--Você continua sua caminhada e se depara com uma barraca de sorvete...");
								//Código para ter uma pausa entre as frases.
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
								
									e.printStackTrace();
								}
								System.out.println("\n--Porém, como não conseguiu alcançar seu primeiro desafio de primeira, você não receberá seu sorvete, a menos que consiga passar pelo próximo desafio!");
								//Preenchimento do vetor, para localização do números que serão necessários para este segundo desafio.
								for(int i=0; i<10; i++) { 
									System.out.println("**Digite um número de 1 a 10 para "+(i+1)+": ");
										vetor[i] = entrada.nextFloat();
								}
								//Operação a ser efetuada pelo usuário entre os números requeridos, para comparação das respostas.
								float mult = vetor[1]*vetor[4];
								//Laço de repetição usado apenas para pular linhas e tornar distante os valores preenchidos para o usuário não ver e cumprir honestamente com o desafio.
								for(int i=0; i<15; i++) { 
									System.out.println("\n");
								}
								//Desafio lançado ao usuário.
								System.out.println("\n**Se lembra dos números que escreveu em segundo lugar e quinto lugar? Ok...digite o resultado da multiplicação entre ambos: ");
								//Leitura da resposta do usuário.
								num_digitado = ler.nextFloat();
								//Laço condicional para validar se o resultado dado pelo usuário está correto, para continuação da história de acordo com essa comparação. 
								//Desta vez, não foi utilizado o laço de repetição while para que o usuário tivesse mais uma chance, pois neste desafio, ele terá apenas uma chance ou ja terão outra consequências.
								if(num_digitado==mult) {
									System.out.println("**Parabéns "+personagem+", você conseguiu passar por mais esse desafio, e ganhará um sorvete, escolha qual sabor você quer: \n1-Morango\n2-Nutella");
									//Variável criada para ler a opção de sabor de sorvete que o usuário irá escolher. No caso, por tratar-se de uma variável inteira, irá reter nela apenas os números referentes aos sabores(1 ou 2).
									int op_svt = ler.nextInt();
									//Laço condicional criado para verificação do sabor escolhido e diferenciação de mensagens a partir disto.
									if (op_svt==1) {
										System.out.println("\n--Aproveite seu sorvete de Morango :D");
									}else {
										System.out.println("\n--Aproveite seu sorvete de Nutella :D");
									}
									//Código para ter uma pausa entre as frases.
									try {
										Thread.sleep(4000);
									} catch (InterruptedException e) {
									
										e.printStackTrace();
									}
									System.out.println("\n--Após aproveitar seu sorvete, você continuou sua caminhada e conseguiu chegar na sua avó. Parabéns GUERREIRAAA!!!");
								
								}else {//Este será o resultado para caso o resultado do usuário, após a comparação, esteja incorreto.
										System.out.println("--Sinto muito, mas você não conseguiu passar por mais esse desafio, e não ganhará um sorvete :/");
										//Código para ter uma pausa entre as frases.
										try {
											Thread.sleep(4000);
										} catch (InterruptedException e) {
										
											e.printStackTrace();
										}
										System.out.println("\n--Após continuar sua jornada até a casa de sua avó, mesmo sem sorvete, você conseguiu chegar em segurança.Parabés!!!");
								}
								
							}
						}
						//Para caso a opção de caminho (Estrada ou Bosque), entrar no caso 1(Estrada), para a execução do programa neste caso, e não executar os próximos.
						break;
						
					case 2://Caso o usuário escolha o caminho 2(Bosuqe).
						System.out.println("O bosque é tão denso, que você não sabe se o sol ainda paira sobre você...");
						Thread.sleep(4000);//tempo de 2 sg
						System.out.println("...VOCÊ VÊ UM VULTO!!");
						System.out.println("Rapido!! escolha sua ação!!\n1 -- Correr!!\n2 -- Lutar!!");
						int acao = ler.nextInt();
						if (acao == 1) {
							    System.out.println("\t **Narrador \nO vulto aparece na sua frente, você fita aqueles enormes olhos que lhe paralizam...é um lobo...e agora?");
						     	Thread.sleep(5000);
						     	 System.out.println();
							    System.out.println("\t **Narrador \nMe parece que só lhe resta pedir por misericórdia.");
							    Thread.sleep(5000);
							    System.out.println();
							    System.out.println("\t **Chapeuzinho \nSENHOR LOBO POR FAVOR POUPE MINHA VIDA, TOME LEVE ESSA CESTA DE DOCES, MAS ME DEIXE VIVA!!!");
							    Thread.sleep(5000);
							    System.out.println();
								System.out.println("\t **Lobo \nchapeuzinho chapeuzinho...minha doce garotinha, a misericórdia não vem a quem não faz\npor merecer, então me responda a essa pergunta corretamente e levarei pouco,\\n responda errado então levarei tudo...");
								Thread.sleep(10000);
								System.out.println();
								System.out.println("Diga o que sou e eu desapareçoo. O que sou eu?");
								Thread.sleep(5000);//tempo de 2 sg
								System.out.println();
								System.out.println("\t**Escolha o número da sua resposta:");
								System.out.println("1 -- O Silêncio \n2 -- Saci-pererê\n3 -- O tempo\n4 -- Uma piada ");
								System.out.println();
								int op2 = ler.nextInt();
								
								if(op2 == 1)
								{
									Thread.sleep(5000);
									System.out.println("\t**Lobo \nHUAHAHAhahah.Adeus garota...ou até logo...");
									Thread.sleep(5000);
									System.out.println("\t**Narrador** \nO lobo sumiu e com ele a sua cesta....você seguiu em frente toda trêmula, \nchegando em sua vó você conta tudo e recebe um abraço e depois uma\nbronca. Você aprendeu uma lição!");
								}
								else
								{
									Thread.sleep(5000);
									System.out.println("\t**Lobo \nHUAHAHAhahah que pena garota.. a misericórdia não olhou por você hoje...");
									Thread.sleep(5000);
									System.out.println("\t**Narrador \nA escuridão partiu mas junto a ele levou sua luz...horas depois um viajante\n lhe encontra e lhe guia até a casa de sua avó, você não é mais capaz de enxergar...");
									
								}
						}//fecha if correr
						if (acao == 2)
						{
							System.out.println("\t**Narrador \nVocê escolheu lutar, você tem fibra gosto disso, agora vamos lá. você olha ao seu redor\n" + 
									"e em seu alcance temos um galho potencialmente danoso, você agacha rápido!! o agarra e o levanta acima da cabeça.");
																	
							
							
							System.out.printf("Mas antes, me de 9 números!! ");
							for(int linha=0; linha<3; linha++) {
								for(int coluna = 0; coluna<3; coluna++) {
									System.out.printf("\nvamos... ");
									matriz[linha][coluna]=entrada.nextInt();										
								}																
							}
							//589afddg participação do meu gato						
							int soma_diagonal = matriz[0][0]+matriz[1][1]-matriz[2][2];
							for(int i=0; i<15; i++) { 
								System.out.println("\n");
							}
							Thread.sleep(2000);
							System.out.println("Agora me diga qual a soma dos números digitados em primeiro e quinto lugar menos o nono lugar?\n respondendo corretamente e esse valor ira ser sua força de ataque + 10\n mas se errar você irá falhar...");
							num_digitado=ler.nextFloat();
							if(soma_diagonal == num_digitado)
							{
								soma_diagonal = soma_diagonal + 10;
								Thread.sleep(3000);
								System.out.println("\t**Narrador \nVocê ataca, com uma força de "+soma_diagonal+" e no mesmo instante você corre, você não pensa só corre!!");
								System.out.println();
								Thread.sleep(5000);
								System.out.println("Snif...Snif...Snif...");
								Thread.sleep(5000);
								System.out.println();
								System.out.println("Você para...olha em direção ao lobo, que está curvado como uma criança enquanto \nchora com um galo vermelho na cabeça.");
								Thread.sleep(5000);
								System.out.println();
								System.out.println("Você se comove, e com cautela se aproxima e lhe oferece um bolinho, o lobo levanta o rosto e fita\n o bolinho com lagrimas nos olhos, ele pega come em uma bocada só, e lhe agradece? ");
								Thread.sleep(5000);
								System.out.println();
								System.out.println("Sim, ele fala O-O' ");
								Thread.sleep(5000);	
								System.out.println();
								System.out.println("Ele lhe acompanhou todo o caminho até sua vó, lhe guiando \npelos caminhos mais seguros, e no caminho vocês conversaram bastante.");
								Thread.sleep(5000);	
								System.out.println();
								System.out.println("**Narrador**\n Me parece que você encontrou um valioso amigo <3 ");
							}else
							{
								Thread.sleep(3000);
								System.out.println("Você falhou...");
								Thread.sleep(3000);
								System.out.println("Naquela noite um uivo ecoou pelo bosque...");
								Thread.sleep(3000);
								System.out.println("Ninguém nunca mais viu a chapeuzinho...");
								Thread.sleep(3000);
								System.out.println("Agora temos uma lenda que diz que naquele bosque, uma garotinha e um enorme lobo correm e brincam por lá");
							}
						}	
							break;
						default:
							//Opção para caso o usuário não escolha os caminhos oferecidos (1-Estrada ou 2-Bosque).
							System.out.println("Digite um opção válida");
				 }			
				Thread.sleep(10000);	
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("FIM \nOi oi, obrigadinha por jogar :3 \nProjeto de: \nPâmela Xavier\nSofia Fernandes");
					
			}
										
}
		 		

